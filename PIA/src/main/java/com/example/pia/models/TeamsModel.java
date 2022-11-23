package com.example.pia.models;

import javax.persistence.*;

@Entity
@Table(name = "Teams")
public class TeamsModel {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(unique = true, nullable = false)
    private int position;

    private String name;
    private int wins;
    private int podiums;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getPodiums() {
        return podiums;
    }

    public void setPodiums(int podiums) {
        this.podiums = podiums;
    }
}
