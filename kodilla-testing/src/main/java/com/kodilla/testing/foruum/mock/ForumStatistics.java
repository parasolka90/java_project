package com.kodilla.testing.foruum.mock;

public class ForumStatistics {
    double averagePostPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
       if(statistics.userNames().size()!=0) {
           averagePostPerUser = (double)statistics.postCount() / statistics.userNames().size();
           averageCommentsPerUser = (double)statistics.commentsCount() / statistics.userNames().size();
       }
       if(statistics.postCount()!=0){
           averageCommentsPerPost = (double)statistics.commentsCount() / statistics.postCount();
       }
    }

    public String showStatistics() {
        return ("Average comments per post: "+averageCommentsPerPost+
                "\nAverage comments per user: "+ averageCommentsPerUser+
                "\nAverage post per user: "+averagePostPerUser);
    }

}
