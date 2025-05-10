package org.zhanx.demo.usergameservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.zhanx.demo.usergameservice.entity.UserGame;

import java.util.List;

public interface UserGameRepository extends JpaRepository<UserGame, Long> {
    List<UserGame> findByUserId(Long userId);
    List<UserGame> findByGameId(Long gameId);
}