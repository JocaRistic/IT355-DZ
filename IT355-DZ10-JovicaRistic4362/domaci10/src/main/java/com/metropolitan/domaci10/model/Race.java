package com.metropolitan.domaci10.model;

import javax.persistence.*;

@Entity
@Table(name = "race")
public class Race {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "race")
    private String race;

    public Race() {
    }

    public Race(int id, String race) {
        this.id = id;
        this.race = race;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
