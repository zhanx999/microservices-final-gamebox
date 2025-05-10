package org.zhanx.demo.usergameservice.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserGameDTO {
    private Long id;
    private Long userId;
    private Long gameId;

    public UserGameDTO() {}
    public UserGameDTO(Long id, Long userId, Long gameId) {
        this.id = id;
        this.userId = userId;
        this.gameId = gameId;
    }

}
