package com.example.sharingapp;

import java.util.UUID;

public class Contact extends Observable {

    private String id;
    private String username;
    private String email;

    public Contact(String username, String email, String id) {
        this.username = username;
        this.email = email;

        if (id == null){
            setId();
        } else {
            updateId(id);
        }
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
        notifyObservers();
    }

    public String getId() {
        return id;
    }

    public void updateId(String id){
        this.id = id;
        notifyObservers();
    }
    public void setUsername(String username) {
        this.username = username;
        notifyObservers();
    }
    public String getUsername() { return username; }

    public void setEmail(String email) {
        this.email = email;
        notifyObservers();
    }
    public String getEmail() { return email; }
}
