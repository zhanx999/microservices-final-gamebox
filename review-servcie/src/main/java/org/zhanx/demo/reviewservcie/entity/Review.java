package org.zhanx.demo.reviewservcie.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Review {
    // Геттеры и сеттеры
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long gameId;
    private String content;
    private int rating;

    public Review() {}
    public Review(Long userId, Long gameId, String content, int rating) {
        this.userId = userId;
        this.gameId = gameId;
        this.content = content;
        this.rating = rating;
    }

}