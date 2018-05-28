package com.sandeep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box<Integer, Integer> integerBox = new Box<>(4, 5);
        System.out.println("T1: " + integerBox.getT1() + " T2 : " + integerBox.getT2());

        Box<Integer, String> mixedBox = new Box<>(4, "Nomura");
        System.out.println("T1: " + mixedBox.getT1() + " T2 : " + mixedBox.getT2());
    }
}
