package com.sandeep;

public class Song {
    String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public void Play() {
        System.out.println("Playing " + title + " Duration : " + duration);
    }
}
