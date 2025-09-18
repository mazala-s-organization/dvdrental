package com.senai.infob.dvdrental.models;

import java.time.LocalDateTime;

public class FilmCategory {
    private int FilmId;
    private int CategoryId;
    private LocalDateTime LastUpdate;
    public FilmCategory() {
    }
    public FilmCategory(int filmId, int categoryId, LocalDateTime lastUpdate) {
        FilmId = filmId;
        CategoryId = categoryId;
        LastUpdate = lastUpdate;
    }
    public int getFilmId() {
        return FilmId;
    }
    public void setFilmId(int filmId) {
        FilmId = filmId;
    }
    public int getCategoryId() {
        return CategoryId;
    }
    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }
    public LocalDateTime getLastUpdate() {
        return LastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        LastUpdate = lastUpdate;
    }

    
}
