package com.ironhack.lab28.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Speakers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double presentationDuration;

    @ManyToOne
    @JoinTable(name = "speaker_conference", joinColumns = {@JoinColumn(name = "speaker_id")}, inverseJoinColumns = {@JoinColumn(name = "conference_id")}
    )

    private Conference conference;
    public Speakers() {
    }

    public Speakers(String name, double presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
