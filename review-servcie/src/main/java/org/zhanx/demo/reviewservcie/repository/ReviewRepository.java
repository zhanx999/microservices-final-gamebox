package org.zhanx.demo.reviewservcie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zhanx.demo.reviewservcie.entity.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByGameId(Long gameId);
    List<Review> findByUserId(Long userId);
}