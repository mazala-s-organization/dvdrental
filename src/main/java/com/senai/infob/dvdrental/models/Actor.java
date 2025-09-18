package com.senai.infob.dvdrental.models;

import java.time.LocalDateTime;

public class Actor {
    private int actorId;
    private String FirstName;
    private String LastName;
    private LocalDateTime lastUpdate;

    public Actor() {
    }

    public Actor(String FirstName, String LastName, int actorId, LocalDateTime lastUpdate) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.actorId = actorId;
        this.lastUpdate = lastUpdate;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
