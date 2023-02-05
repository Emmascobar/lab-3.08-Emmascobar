package com.ironhack.lab28.model;

import jakarta.persistence.ManyToMany;

import java.util.List;

public class Conference extends Event {

    private List<Speakers> speakers;


    public Conference() {
    }
    @ManyToMany
    public Conference(List<Speakers> speakers) {
        this.speakers = speakers;
    }

    public Conference(int date, double duration, String location, String title, List<Guest> invitados) {
        super(date, duration, location, title, invitados);
    }

    public List<Speakers> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speakers> speakers) {
        this.speakers = speakers;
    }
}
