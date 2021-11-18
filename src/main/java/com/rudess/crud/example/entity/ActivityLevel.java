package com.rudess.crud.example.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "ACTIVITY_LEVEL")

public class ActivityLevel implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    private int minutes;
    private String name;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
