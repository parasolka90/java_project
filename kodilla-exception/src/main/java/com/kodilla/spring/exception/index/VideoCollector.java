package com.kodilla.spring.exception.index;

import java.util.ArrayList;
import java.util.List;

public class VideoCollector {
    public List<String> getCollection() {
        ArrayList<String> videos = new ArrayList<>();
        videos.add("Extra Movie");
        videos.add("extra mov1");
        return videos;
    }
}
