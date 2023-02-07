package com.ironhack.lab28.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Exposition extends Event {

    public Exposition() {
    }

    public Exposition(Long id, Date date, double duration, String location, String title, List<Guest> invitados) {
        super(id, date, duration, location, title, invitados);
    }
}
