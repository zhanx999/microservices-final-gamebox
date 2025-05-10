package org.zhanx.demo.reviewservcie.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.zhanx.demo.reviewservcie.dto.GameDTO;

@FeignClient(name = "game-service")
public interface GameClient {
    @GetMapping("/games/{id}")
    GameDTO getGameById(@PathVariable("id") Long id);
}