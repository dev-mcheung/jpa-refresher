package com.mcheung.jpa.refresher.jparefresher.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

//Table - User

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String role;

    protected User() {

    }

    public User(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
