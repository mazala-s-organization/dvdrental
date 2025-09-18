package com.senai.infob.dvdrental.models;

import java.time.LocalDateTime;

public class Language {
    private int LanguageId;
    private String name;
    private LocalDateTime LastUpdate;
    public Language() {
    }
    public Language(int languageId, String name, LocalDateTime lastUpdate) {
        LanguageId = languageId;
        this.name = name;
        LastUpdate = lastUpdate;
    }
    public int getLanguageId() {
        return LanguageId;
    }
    public void setLanguageId(int languageId) {
        LanguageId = languageId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getLastUpdate() {
        return LastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        LastUpdate = lastUpdate;
    }

    
}
