package com.ironhack.lab28.model;
import jakarta.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    private String renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapters_id")
    private Chapters chapter;

    public Chapters getChapters() {
        return chapter;
    }

    public void setChapters(Chapters chapters) {
        this.chapter = chapters;
    }

    public Member() {
    }

    public Member(String name, MemberStatus memberStatus, String renewalDate) {
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
