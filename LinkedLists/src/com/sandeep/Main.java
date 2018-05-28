package com.sandeep;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("newzealand");
        placesToVisit.add("Gold coast");
        placesToVisit.add("Melbourne");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> cities = linkedList.iterator();
        while(cities.hasNext()) {
            System.out.println("Now visiting "+ cities.next());
        }
    }
}
