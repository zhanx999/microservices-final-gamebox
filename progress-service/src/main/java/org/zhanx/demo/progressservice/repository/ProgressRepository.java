package org.zhanx.demo.progressservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.zhanx.demo.progressservice.entity.Progress;

import java.util.List;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
    List<Progress> findByUserId(Long userId);
    List<Progress> findByGameId(Long gameId);
}