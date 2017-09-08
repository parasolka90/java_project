package com.kodilla.spring.testing.foruum.mock;

import java.util.List;

public interface Statistics {
    List<String> userNames(); //list of usernames
    int postCount();
    int commentsCount();
}
