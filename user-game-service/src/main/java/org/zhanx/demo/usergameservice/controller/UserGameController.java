package org.zhanx.demo.usergameservice.controller;

import org.springframework.web.bind.annotation.*;
import org.zhanx.demo.usergameservice.entity.UserGame;
import org.zhanx.demo.usergameservice.service.UserGameService;

import java.util.List;

@RestController
@RequestMapping("/user-games")
public class UserGameController {
    private final UserGameService userGameService;
    public UserGameController(UserGameService userGameService) { this.userGameService = userGameService; }

    @PostMapping
    public UserGame addUserGame(@RequestBody UserGame userGame) {
        return userGameService.addGameToUser(userGame);
    }

    @GetMapping("/user/{userId}")
    public List<UserGame> getGamesByUser(@PathVariable Long userId) {
        return userGameService.getGamesByUser(userId);
    }

    @GetMapping("/game/{gameId}")
    public List<UserGame> getUsersByGame(@PathVariable Long gameId) {
        return userGameService.getUsersByGame(gameId);
    }
}
