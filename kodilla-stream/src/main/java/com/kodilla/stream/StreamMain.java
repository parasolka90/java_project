package com.kodilla.stream;

import com.kodilla.stream.immutable.Forum;
import com.kodilla.stream.immutable.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[]args) {
        Forum forum = new Forum();
        LocalDate a =LocalDate.now().minusYears(20);


        Map<Integer,ForumUser> resultMapForumUser = forum.getUserList().stream()
                .filter(user->user.getSex()=='M')
                .filter(user->user.getBirthdate().isBefore(a))
                .filter(user->user.getPostCount()>0)

                .collect(Collectors.toMap(ForumUser::getId, user->user));


        resultMapForumUser.entrySet().stream()
                .forEach(System.out::println);


    }
}