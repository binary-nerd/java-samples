package com.sandeep;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String name;
    String artist;
    List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public void add(String title, double duration) {
        if (findSong(title) == null)
            songs.add(new Song(title, duration));
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.title == title)
                return checkedSong;
        }

        return null;
    }

    public void remove(Song song) {
        songs.remove(song);
    }
}
