package com.ironhack.lab28.model;
import jakarta.persistence.*;
import jakarta.persistence.*;

@Entity
public class Members {

    @Id
    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    private String renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapters_id")
    private Chapters chapters;

    public Chapters getChapters() {
        return chapters;
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    public Members() {
    }

    public Members(String name, MemberStatus memberStatus, String renewalDate) {
        this.name = name;
        this.memberStatus = memberStatus;
        this.renewalDate = renewalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }
}
