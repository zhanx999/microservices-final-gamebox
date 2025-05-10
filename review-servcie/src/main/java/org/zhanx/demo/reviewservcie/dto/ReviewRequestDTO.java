package org.zhanx.demo.reviewservcie.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

// DTO для запроса на создание отзыва
@Getter
@Setter
public class ReviewRequestDTO {
    private Long userId;
    private Long gameId;
    private String content;
    private int rating;
    public ReviewRequestDTO() {}

}
