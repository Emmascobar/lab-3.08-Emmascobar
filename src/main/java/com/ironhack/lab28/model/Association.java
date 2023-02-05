package com.ironhack.lab28.model;

import jakarta.persistence.*;
@Entity

public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;

    @OneToMany
    private Chapters chapter01;

//    @Embedded
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n01")),
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n02")),
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n03")),
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n04")),
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n05")),
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n06")),
//    @AttributeOverride( name = "chapter", column = @Column("chapter_n07")),

}
