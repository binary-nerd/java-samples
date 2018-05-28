package com.sandeep;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

    //1 Method
//	    new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable");
//            }
//        }).start();

        //2nd Method
//        new Thread(new CodetoRun()).start();

        //Using lambdas
        new Thread(()-> {
            System.out.println("Printing from runnable");
        }).start();
        //Every lambda has 3 parts..
        // 1. Argument list, 2. Arrow token, 3. body
        // Compiler checks the constructor and checkes the methods..
        // Ideally it should have only one method and only then lambdas can be used..

    }
}

class CodetoRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from thread");
    }
}


class Employee {
    private String name;
    private int age;
}