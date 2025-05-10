package org.zhanx.demo.progressservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Entity
@Setter
public class Progress {
    // Геттеры и сеттеры
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long gameId;
    private double progressValue; // например, процент прохождения

    public Progress() {}
    public Progress(Long userId, Long gameId, double progressValue) {
        this.userId = userId;
        this.gameId = gameId;
        this.progressValue = progressValue;
    }

}