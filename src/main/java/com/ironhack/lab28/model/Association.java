package com.ironhack.lab28.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @ManyToOne
    @JoinColumn(name = "chapters_id")
    private List<Chapters> chapter;

    public Association() {
    }

    public Association(Long number, List<Chapters> chapter) {
        this.number = number;
        this.chapter = chapter;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Chapters getChapter() {
        return (Chapters) chapter;
    }

    public void setChapter(List<Chapters> chapter) {
        this.chapter = chapter;
    }
}
