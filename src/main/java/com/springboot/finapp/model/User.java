package com.springboot.finapp.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("users") // Cassandra table name
public class User {

    @PrimaryKey
    private String userId;
    private String name;
    private String email;

    //No-arg constructor (mandatory for Jackson)
    public User() {}

    // Optional convenience constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}