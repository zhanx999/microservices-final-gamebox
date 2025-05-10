package org.zhanx.demo.reviewservcie.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhanx.demo.reviewservcie.dto.*;
import org.zhanx.demo.reviewservcie.dto.ReviewRequestDTO;
import org.zhanx.demo.reviewservcie.dto.ReviewResponseDTO;
import org.zhanx.demo.reviewservcie.entity.Review;
import org.zhanx.demo.reviewservcie.feign.GameClient;
import org.zhanx.demo.reviewservcie.feign.UserClient;
import org.zhanx.demo.reviewservcie.repository.ReviewRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final UserClient userClient;
    private final GameClient gameClient;

    public ReviewService(ReviewRepository reviewRepository, UserClient userClient, GameClient gameClient) {
        this.reviewRepository = reviewRepository;
        this.userClient = userClient;
        this.gameClient = gameClient;
    }

    public ReviewResponseDTO createReview(ReviewRequestDTO dto) {
        // Проверка пользователя и игры (через Feign)
        UserDTO user = userClient.getUserById(dto.getUserId());
        GameDTO game = gameClient.getGameById(dto.getGameId());
        // Сохраняем отзыв
        Review review = new Review(dto.getUserId(), dto.getGameId(), dto.getContent(), dto.getRating());
        reviewRepository.save(review);
        // Формируем ответ с именем пользователя и названием игры
        return new ReviewResponseDTO(
                review.getId(),
                review.getContent(),
                review.getRating(),
                user.getId(),
                user.getName(),
                game.getId(),
                game.getTitle()
        );
    }

    public ReviewResponseDTO getReviewById(Long id) {
        return reviewRepository.findById(id)
                .map(review -> {
                    UserDTO user = userClient.getUserById(review.getUserId());
                    GameDTO game = gameClient.getGameById(review.getGameId());
                    return new ReviewResponseDTO(
                            review.getId(),
                            review.getContent(),
                            review.getRating(),
                            user.getId(),
                            user.getName(),
                            game.getId(),
                            game.getTitle()
                    );
                }).orElse(null);
    }

    public List<ReviewResponseDTO> getReviewsByGame(Long gameId) {
        List<Review> reviews = reviewRepository.findByGameId(gameId);
        return reviews.stream().map(review -> {
            UserDTO user = userClient.getUserById(review.getUserId());
            GameDTO game = gameClient.getGameById(review.getGameId());
            return new ReviewResponseDTO(
                    review.getId(),
                    review.getContent(),
                    review.getRating(),
                    user.getId(),
                    user.getName(),
                    game.getId(),
                    game.getTitle()
            );
        }).collect(Collectors.toList());
    }
}
