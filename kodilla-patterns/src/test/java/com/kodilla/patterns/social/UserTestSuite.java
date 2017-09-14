package com.kodilla.patterns.social;


import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Milennial user");
        User user2 = new Ygeneration("Ygeneration user");
        User user3 = new Zgeneration("Zgeneration user");

        //When
        String user1Posted = user1.sharePost();
        System.out.println("Millenial user posted on: " + user1Posted);
        String user2Posted = user2.sharePost();
        System.out.println("YGeneration user posted on: " + user2Posted);
        String user3Posted = user3.sharePost();
        System.out.println("ZGeneration user posted on: " + user3Posted);

        //Then
        Assert.assertEquals("Facebook", user1Posted);
        Assert.assertEquals("Twitter", user2Posted);
        Assert.assertEquals("Snapchat", user3Posted);
    }

    @Test
    public void testIndividualUserSharingStrategy() {
        //Given
        User user1 = new Millenials("Millenial user");
        //When
        String user1Posted = user1.sharePost();
        System.out.println("Millenial user posted on: " + user1Posted);
        user1.setSharedPost(new SnapchatPublisher());
        user1Posted = user1.sharePost();
        System.out.println("Millenial user now posted on: " + user1Posted);
        //Then
        Assert.assertEquals("Snapchat", user1Posted);
    }

}
