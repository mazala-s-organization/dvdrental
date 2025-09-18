package com.senai.infob.dvdrental.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    private int customerId;
    private int storeId;
    private String firstName;  
    private String lastName;
    private String email;
    private int adressId;
    private boolean activebool;
    private LocalDate createDate;
    private LocalDateTime lastUpdate;
    private boolean active;
    public Customer() {
    }
    public Customer(int customerId, int storeId, String firstName, String lastName, String email, int adressId,
            boolean activebool, LocalDate createDate, LocalDateTime lastUpdate, boolean active) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.adressId = adressId;
        this.activebool = activebool;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.active = active;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAdressId() {
        return adressId;
    }
    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }
    public boolean isActivebool() {
        return activebool;
    }
    public void setActivebool(boolean activebool) {
        this.activebool = activebool;
    }
    public LocalDate getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    
}
