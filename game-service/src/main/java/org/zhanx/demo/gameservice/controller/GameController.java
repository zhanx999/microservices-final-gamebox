package org.zhanx.demo.gameservice.controller;


import org.springframework.web.bind.annotation.*;
import org.zhanx.demo.gameservice.entity.Game;
import org.zhanx.demo.gameservice.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;
    public GameController(GameService gameService) { this.gameService = gameService; }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {
        return gameService.getGame(id);
    }

    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game game) {
        return gameService.updateGame(id, game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
    }
}
