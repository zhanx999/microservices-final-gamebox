package org.zhanx.demo.reviewservcie.controller;


import org.springframework.web.bind.annotation.*;
import org.zhanx.demo.reviewservcie.dto.*;

import org.zhanx.demo.reviewservcie.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) { this.reviewService = reviewService; }

    @PostMapping
    public ReviewResponseDTO createReview(@RequestBody ReviewRequestDTO dto) {
        return reviewService.createReview(dto);
    }

    @GetMapping("/{id}")
    public ReviewResponseDTO getReview(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @GetMapping("/game/{gameId}")
    public List<ReviewResponseDTO> getReviewsByGame(@PathVariable Long gameId) {
        return reviewService.getReviewsByGame(gameId);
    }
}
