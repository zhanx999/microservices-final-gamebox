package org.zhanx.demo.progressservice.service;


import org.springframework.stereotype.Service;
import org.zhanx.demo.progressservice.entity.Progress;
import org.zhanx.demo.progressservice.repository.ProgressRepository;

import java.util.List;

@Service
public class ProgressService {
    private final ProgressRepository progressRepository;
    public ProgressService(ProgressRepository progressRepository) {
        this.progressRepository = progressRepository;
    }

    public Progress createProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    public Progress getProgress(Long id) {
        return progressRepository.findById(id).orElse(null);
    }

    public List<Progress> getProgressByUser(Long userId) {
        return progressRepository.findByUserId(userId);
    }

    public List<Progress> getProgressByGame(Long gameId) {
        return progressRepository.findByGameId(gameId);
    }
}