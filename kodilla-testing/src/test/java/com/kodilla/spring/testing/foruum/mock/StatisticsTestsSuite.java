package com.kodilla.spring.testing.foruum.mock;

        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.List;

        import static org.mockito.Mockito.mock;
        import static org.mockito.Mockito.when;

public class StatisticsTestsSuite {
    @Test
    public void testCalculatePostZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();
        statisticList.add("lolo");
        statisticList.add("lolo1");
        statisticList.add("lolo2");
        statisticList.add("lolo3");
        statisticList.add("lolo4");
        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(0.2, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.1);

    }

    @Test
    public void testCalculatePost100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();
        statisticList.add("lolo");
        statisticList.add("lolo1");
        statisticList.add("lolo2");
        statisticList.add("lolo3");
        statisticList.add("lolo4");
        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(200, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(0.2, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.1);
    }

    @Test
    public void testCalculateCommentsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();
        statisticList.add("lolo");
        statisticList.add("lolo1");
        statisticList.add("lolo2");
        statisticList.add("lolo3");
        statisticList.add("lolo4");
        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.2, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.1);

    }

    @Test
    public void testCalculateUsersZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.1);

    }

    @Test
    public void testCalculateUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            statisticList.add("");
        }

        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.2, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.1);
    }

    @Test
    public void testCalculateCommentsLessPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();
        statisticList.add("lolo");
        statisticList.add("lolo1");
        statisticList.add("lolo2");
        statisticList.add("lolo3");
        statisticList.add("lolo4");

        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2.0, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(0, forumStatistics.averageCommentsPerPost, 0.1);
    }

    @Test
    public void testCalculateCommentsHigherPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticList = new ArrayList<>();
        statisticList.add("lolo");
        statisticList.add("lolo1");
        statisticList.add("lolo2");
        statisticList.add("lolo3");
        statisticList.add("lolo4");

        when(statisticsMock.userNames()).thenReturn(statisticList);
        when(statisticsMock.postCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, forumStatistics.averagePostPerUser, 0.1);
        Assert.assertEquals(2, forumStatistics.averageCommentsPerUser, 0.1);
        Assert.assertEquals(2, forumStatistics.averageCommentsPerPost, 0.1);

    }
}
