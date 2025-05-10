package org.zhanx.demo.usergameservice.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class UserGame {
    // Геттеры и сеттеры
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long gameId;

    public UserGame() {}
    public UserGame(Long userId, Long gameId) {
        this.userId = userId;
        this.gameId = gameId;
    }

}
