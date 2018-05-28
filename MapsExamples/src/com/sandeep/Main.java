package com.sandeep;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> languages= new HashMap<>();
        languages.put("Java", "A compiled high level object-oriented programming language.");
        languages.put("C", "Flawless low level language.. Native language");
        languages.put("Python", "An interpretted object-oriented high-level programming language with dynamic semantics");

//        System.out.println(languages.get("Java"));

//        languages.remove("Python");
        languages.replace("Java", "I am learning it now..");
        for (String Key: languages.keySet()) {
            System.out.println(Key + " : " + languages.get(Key));
        }
    }
}
