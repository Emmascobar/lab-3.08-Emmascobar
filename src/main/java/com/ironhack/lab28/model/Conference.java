package com.ironhack.lab28.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speakers> speakers;

    public Conference() {
    }
    public Conference(List<Speakers> speakers) {
        this.speakers = speakers;
    }

    public Conference(Long id, Date date, double duration, String location, String title, List<Guest> invitados) {
        super(id, date, duration, location, title, invitados);
    }

    public List<Speakers> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speakers> speakers) {
        this.speakers = speakers;
    }
}
