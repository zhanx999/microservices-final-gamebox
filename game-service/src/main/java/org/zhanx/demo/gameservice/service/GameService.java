package org.zhanx.demo.gameservice.service;

import org.springframework.stereotype.Service;
import org.zhanx.demo.gameservice.entity.Game;
import org.zhanx.demo.gameservice.repository.GameRepository;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game getGame(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game updateGame(Long id, Game updated) {
        return gameRepository.findById(id).map(g -> {
            g.setTitle(updated.getTitle());
            g.setDescription(updated.getDescription());
            return gameRepository.save(g);
        }).orElse(null);
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}