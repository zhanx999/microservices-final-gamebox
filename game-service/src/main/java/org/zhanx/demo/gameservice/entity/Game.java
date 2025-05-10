package org.zhanx.demo.gameservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    public Game() {}
    public Game(String title, String description) {
        this.title = title;
        this.description = description;
    }

}