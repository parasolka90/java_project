package com.kodilla.patterns.social;

public class Ygeneration extends User {

    public Ygeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }

}
