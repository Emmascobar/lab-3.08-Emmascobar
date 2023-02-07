package com.ironhack.lab28.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {

    private Long id;
    private int date;
    private double duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event")
    List<Guest> invitados;

    public Event() {
    }

    public Event(Long id, int date, double duration, String location, String title, List<Guest> invitados) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.invitados = invitados;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getInvitados() {
        return invitados;
    }

    public void setInvitados(List<Guest> invitados) {
        this.invitados = invitados;
    }
}
