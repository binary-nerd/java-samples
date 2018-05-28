package com.sandeep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of the computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of the road.."));
        locations.put(2, new Location(2, "You are on top of a hill"));
        locations.put(3, new Location(3, "You are inside a building"));

        locations.get(1).addExit("W", 2);
        int loc = 1;
        while(true) {
            if (loc == 0) break;

            loc = scanner.nextInt();
            System.out.println(locations.get(loc).getDescription());
        }
    }
}
