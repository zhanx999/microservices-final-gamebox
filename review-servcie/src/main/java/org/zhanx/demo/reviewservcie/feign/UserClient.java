package org.zhanx.demo.reviewservcie.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.zhanx.demo.reviewservcie.dto.UserDTO;

@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/users/{id}")
    UserDTO getUserById(@PathVariable("id") Long id);
}