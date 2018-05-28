package com.sandeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> bNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "g64",
                "O71"
        );

        List<String> gNumbers = new ArrayList<>();
        bNumbers.forEach(number->{
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
            }
        });
        gNumbers.sort(String::compareTo);
        gNumbers.forEach(System.out::println);
    }
}
