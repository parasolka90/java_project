package com.kodilla.stream.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(36, "user1", 'F', 1990, 12, 12, 15));
        theForumUserList.add(new ForumUser(25, "user2", 'M', 1991, 11, 15, 1));
        theForumUserList.add(new ForumUser(665, "user3", 'F', 2000, 10, 1, 8));
        theForumUserList.add(new ForumUser(254, "user4", 'M', 2015, 06, 5, 0));
        theForumUserList.add(new ForumUser(851, "user5", 'M', 1995, 03, 19, 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);

    }

}

