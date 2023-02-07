package com.ironhack.lab28.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Chapters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;
    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

    public Chapters() {
    }

    public Chapters(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
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


    public List<Member> getMember() {
        return members;
    }

    public void setMember(List<Member> member) {
        this.members = member;
    }
}
