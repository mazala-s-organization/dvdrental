package com.senai.infob.dvdrental.models;

import java.sql.Blob;
import java.time.LocalDateTime;

public class Staff {
    private int staffId;
    private String firstName;
    private String lastName;
    private int adressId;
    private String email;
    private int storeId;
    private boolean active;
    private String username;
    private String password;
    private LocalDateTime lastUpdate;
    private Blob picture;
    public Staff() {
    }
    public Staff(int staffId, String firstName, String lastName, int adressId, String email, int storeId,
            boolean active, String username, String password, LocalDateTime lastUpdate, Blob picture) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adressId = adressId;
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.password = password;
        this.lastUpdate = lastUpdate;
        this.picture = picture;
    }
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAdressId() {
        return adressId;
    }
    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Blob getPicture() {
        return picture;
    }
    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    
}
