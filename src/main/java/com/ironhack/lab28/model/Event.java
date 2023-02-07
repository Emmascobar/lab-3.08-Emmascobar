package com.ironhack.lab28.model;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double duration;
    private String location;
    private String title;

    @ManyToMany     // muchos invitados pueden ir a muchos eventos.
    @JoinTable(    // Se crea la tabla que va a relacionar...
            name = "event_guests",   // eventos con invitados con X nombre.
            joinColumns = {@JoinColumn(name = "event:id", referencedColumnName = "id")})
            // Donde se unen las COLUMNAS EVENT ID e ID de la columna de invitados.
    List<Guest> guests;

    public Event() {
    }

    public Event(Long id, Date date, double duration, String location, String title, List<Guest> guests) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.guests = guests;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
        return guests;
    }

    public void setInvitados(List<Guest> guests) {
        this.guests = guests;     }
}
