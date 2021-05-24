package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String lastname;

    public Player() {
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
