package org.zhanx.demo.progressservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgressDTO {
    private Long id;
    private Long userId;
    private Long gameId;
    private double progressValue;

    public ProgressDTO() {}
    public ProgressDTO(Long id, Long userId, Long gameId, double progressValue) {
        this.id = id;
        this.userId = userId;
        this.gameId = gameId;
        this.progressValue = progressValue;
    }

}