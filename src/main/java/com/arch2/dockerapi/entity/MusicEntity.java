package com.arch2.dockerapi.entity;

import javax.persistence.*;

@Entity
public class MusicEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    public MusicEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MusicEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
