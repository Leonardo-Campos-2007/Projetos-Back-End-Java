
package com.seuprojeto.recommendation;

import com.seuprojeto.recommendation.domain.Rating;
import com.seuprojeto.recommendation.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final RatingRepository repository;

    @Override
    public void run(String... args) {
        repository.saveAll(List.of(
                new Rating(null, 1L, 1L, 5.0),
                new Rating(null, 1L, 2L, 3.0),
                new Rating(null, 2L, 1L, 4.0),
                new Rating(null, 2L, 3L, 5.0),
                new Rating(null, 3L, 2L, 4.0),
                new Rating(null, 3L, 3L, 5.0)
        ));
    }
}
