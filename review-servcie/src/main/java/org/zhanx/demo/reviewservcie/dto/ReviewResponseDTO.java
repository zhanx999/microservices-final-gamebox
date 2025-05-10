package org.zhanx.demo.reviewservcie.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// DTO для ответа с дополнительной информацией
public class ReviewResponseDTO {
    private Long id;
    private String content;
    private int rating;
    private Long userId;
    private String userName;
    private Long gameId;
    private String gameTitle;

    public ReviewResponseDTO() {
    }
    public ReviewResponseDTO(Long id, String content, int rating,
                             Long userId, String userName,
                             Long gameId, String gameTitle) {
        this.id = id;
        this.content = content;
        this.rating = rating;
        this.userId = userId;
        this.userName = userName;
        this.gameId = gameId;
        this.gameTitle = gameTitle;
}

}