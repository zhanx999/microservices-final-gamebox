package org.zhanx.demo.usergameservice.service;



import org.springframework.stereotype.Service;
import org.zhanx.demo.usergameservice.entity.UserGame;
import org.zhanx.demo.usergameservice.repository.UserGameRepository;

import java.util.List;

@Service
public class UserGameService {
    private final UserGameRepository userGameRepository;
    public UserGameService(UserGameRepository userGameRepository) {
        this.userGameRepository = userGameRepository;
    }

    public UserGame addGameToUser(UserGame userGame) {
        return userGameRepository.save(userGame);
    }

    public List<UserGame> getGamesByUser(Long userId) {
        return userGameRepository.findByUserId(userId);
    }

    public List<UserGame> getUsersByGame(Long gameId) {
        return userGameRepository.findByGameId(gameId);
    }
}
