package com.kodilla.spring.stream.immutable;

import java.time.LocalDate;

public final class ForumUser {
    final int id;
    final String username;
    final char sex;
    final LocalDate birthdate;
    final int postCount;

    public ForumUser(final int id, final String username, final char sex,
                     final int yearOfBirth, final int monthOfBirth,
                     final int dayOfBirth, final int postCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthdate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postCount = postCount;

    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostCount() {
        return postCount;
    }


    @Override
    public String toString() {
        return "ForumUser [id=" + id + ", username=" + username + ", sex=" + sex + ", birthdate=" + birthdate
                + ", postCount=" + postCount +"]";
    }
}

