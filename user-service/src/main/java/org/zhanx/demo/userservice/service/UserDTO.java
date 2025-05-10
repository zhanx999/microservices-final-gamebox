package org.zhanx.demo.userservice.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    // Геттеры и сеттеры
    private Long id;
    private String name;
    private String email;

    public UserDTO() {}
    public UserDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
