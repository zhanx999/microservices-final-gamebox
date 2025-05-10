package org.zhanx.demo.gameservice.repository;
import org.zhanx.demo.gameservice.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}