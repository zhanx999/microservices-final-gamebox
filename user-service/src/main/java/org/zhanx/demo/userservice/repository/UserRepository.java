package org.zhanx.demo.userservice.repository;

import org.zhanx.demo.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}