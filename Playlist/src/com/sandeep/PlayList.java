package com.sandeep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayList {
    LinkedList<Song> songs;

    public int add(Song song) {
        if (songs.contains(song)) {
            System.out.println("Song already present");
            return 0;
        }

        songs.add(song);
        return 0;
    }

    public int remove(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
        } else {
            System.out.println("Song " + song.title + " Not present in the playlist.");
            return -1;
        }

        return 0;
    }

}
