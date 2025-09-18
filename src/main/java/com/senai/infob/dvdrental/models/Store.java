package com.senai.infob.dvdrental.models;

import java.time.LocalDateTime;

public class Store {
    private int storeId;
    private int managerStaffId;
    private int adressId;
    private LocalDateTime lastUpdate;
    public Store() {
    }
    public Store(int storeId, int managerStaffId, int adressId, LocalDateTime lastUpdate) {
        this.storeId = storeId;
        this.managerStaffId = managerStaffId;
        this.adressId = adressId;
        this.lastUpdate = lastUpdate;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public int getManagerStaffId() {
        return managerStaffId;
    }
    public void setManagerStaffId(int managerStaffId) {
        this.managerStaffId = managerStaffId;
    }
    public int getAdressId() {
        return adressId;
    }
    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}
