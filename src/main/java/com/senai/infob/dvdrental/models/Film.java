package com.senai.infob.dvdrental.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Film {
    private int filmId;
    private String title;
    private String description;
    private LocalDate ReleaseYear;
    private int languageId;
    private double rentalDuration;
    private int lenght;
    private double replacementCost;
    private String rating;
    private LocalDateTime lastUpdate;
    private String specialFeatures;
    private String fulltext;
    
    public Film() {
    }

    public Film(int filmId, String title, String description, LocalDate releaseYear, int languageId,
            double rentalDuration, int lenght, double replacementCost, String rating, LocalDateTime lastUpdate,
            String specialFeatures, String fulltext) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        ReleaseYear = releaseYear;
        this.languageId = languageId;
        this.rentalDuration = rentalDuration;
        this.lenght = lenght;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.lastUpdate = lastUpdate;
        this.specialFeatures = specialFeatures;
        this.fulltext = fulltext;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        ReleaseYear = releaseYear;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public double getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(double rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    
}
