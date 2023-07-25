package com.example.Restaurante.dtos;

public class MenuResponseDTO extends MenuDTO {
    private String name;
    private Integer price;
    private String url;
    private String description;

    public MenuResponseDTO(String name, Integer price, String url, String description) {
        this.name = name;
        this.price = price;
        this.url = url;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
