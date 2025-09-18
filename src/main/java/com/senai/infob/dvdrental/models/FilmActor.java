package com.senai.infob.dvdrental.models;

import java.time.LocalDateTime;

public class FilmActor {
    private int actorId;
    private String name;
    private LocalDateTime lastUpdate;
    public FilmActor() {
    }
    public FilmActor(int actorId, String name, LocalDateTime lastUpdate) {
        this.actorId = actorId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }
    public int getActorId() {
        return actorId;
    }
    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    
}
