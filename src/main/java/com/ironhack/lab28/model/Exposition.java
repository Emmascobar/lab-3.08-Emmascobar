package com.ironhack.lab28.model;

import java.util.List;

public class Exposition extends Event {
    public Exposition() {
    }

    public Exposition(int date, double duration, String location, String title, List<Guest> invitados) {
        super(date, duration, location, title, invitados);
    }
}
