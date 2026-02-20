
package com.seuprojeto.recommendation.service;

import com.seuprojeto.recommendation.domain.Rating;
import com.seuprojeto.recommendation.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RatingRepository ratingRepository;

    public List<Long> recommendForUser(Long userId) {

        List<Rating> allRatings = ratingRepository.findAll();

        Map<Long, Map<Long, Double>> userRatings = new HashMap<>();

        for (Rating rating : allRatings) {
            userRatings
                .computeIfAbsent(rating.getUserId(), k -> new HashMap<>())
                .put(rating.getItemId(), rating.getScore());
        }

        Map<Long, Double> targetUserRatings = userRatings.get(userId);
        if (targetUserRatings == null) return List.of();

        double highestSimilarity = 0;
        Long mostSimilarUser = null;

        for (Long otherUserId : userRatings.keySet()) {
            if (!otherUserId.equals(userId)) {

                double similarity = cosineSimilarity(
                        targetUserRatings,
                        userRatings.get(otherUserId)
                );

                if (similarity > highestSimilarity) {
                    highestSimilarity = similarity;
                    mostSimilarUser = otherUserId;
                }
            }
        }

        if (mostSimilarUser == null) return List.of();

        Map<Long, Double> similarUserRatings = userRatings.get(mostSimilarUser);

        return similarUserRatings.keySet().stream()
                .filter(item -> !targetUserRatings.containsKey(item))
                .toList();
    }

    private double cosineSimilarity(Map<Long, Double> userA,
                                    Map<Long, Double> userB) {

        Set<Long> commonItems = new HashSet<>(userA.keySet());
        commonItems.retainAll(userB.keySet());

        double dotProduct = 0.0;

        for (Long item : commonItems) {
            dotProduct += userA.get(item) * userB.get(item);
        }

        double normA = Math.sqrt(
                userA.values().stream().mapToDouble(v -> v * v).sum()
        );

        double normB = Math.sqrt(
                userB.values().stream().mapToDouble(v -> v * v).sum()
        );

        if (normA == 0 || normB == 0) return 0;

        return dotProduct / (normA * normB);
    }
}
