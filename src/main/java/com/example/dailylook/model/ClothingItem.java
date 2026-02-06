package com.example.dailylook.model;

import jakarta.persistence.*;

@Entity
public class ClothingItem {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;
    private String season;
    private String occasion;
    private String color;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSeason() {
        return season;
    }

    public String getOccasion() {
        return occasion;
    }

    public String getColor() {
        return color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public void setColor(String color) {
        this.color = color;
    }
}