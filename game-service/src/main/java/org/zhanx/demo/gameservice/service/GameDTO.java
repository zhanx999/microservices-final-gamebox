package org.zhanx.demo.gameservice.service;
public class GameDTO {
    private Long id;
    private String title;
    private String description;

    public GameDTO() {}
    public GameDTO(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    // Геттеры и сеттеры
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}