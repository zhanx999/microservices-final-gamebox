package org.zhanx.demo.progressservice.controller;


import org.springframework.web.bind.annotation.*;
import org.zhanx.demo.progressservice.entity.Progress;
import org.zhanx.demo.progressservice.service.ProgressService;

import java.util.List;

@RestController
@RequestMapping("/progress")
public class ProgressController {
    private final ProgressService progressService;
    public ProgressController(ProgressService progressService) { this.progressService = progressService; }

    @PostMapping
    public Progress createProgress(@RequestBody Progress progress) {
        return progressService.createProgress(progress);
    }

    @GetMapping("/{id}")
    public Progress getProgressById(@PathVariable Long id) {
        return progressService.getProgress(id);
    }

    @GetMapping("/user/{userId}")
    public List<Progress> getProgressByUser(@PathVariable Long userId) {
        return progressService.getProgressByUser(userId);
    }

    @GetMapping("/game/{gameId}")
    public List<Progress> getProgressByGame(@PathVariable Long gameId) {
        return progressService.getProgressByGame(gameId);
    }
}
