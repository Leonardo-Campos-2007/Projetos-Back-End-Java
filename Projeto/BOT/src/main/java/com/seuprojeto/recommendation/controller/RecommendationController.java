
package com.seuprojeto.recommendation.controller;

import com.seuprojeto.recommendation.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recommendations")
public class RecommendationController {

    private final RecommendationService service;

    @GetMapping("/{userId}")
    public ResponseEntity<List<Long>> recommend(@PathVariable Long userId) {
        return ResponseEntity.ok(service.recommendForUser(userId));
    }
}
