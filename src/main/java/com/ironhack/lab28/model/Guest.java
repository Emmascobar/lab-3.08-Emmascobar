package com.ironhack.lab28.model;
import jakarta.persistence.*;
public class Guest {

    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @ManyToOne
    private Event event;

    public Guest() {
    }

    public Guest(String name, GuestStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }
}
