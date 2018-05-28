package com.sandeep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here
        Album album = new Album("classics", "arijit");
        album.add("tum hi ho", 4.6);
        album.add("isi ke liye", 4.5);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("List does not contain any songs..");
            return;
        }

        System.out.println("Playing Song : " + listIterator.next().title);
    }
}
