package com.ironhack.lab28.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

@Embeddable
public class Chapters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;
    private String president;

    @OneToMany(mappedBy = "chapter")

    private List<Members> members;

    public Chapters() {
    }

    public Chapters(String name, String district, String president, List<Members> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }
}
