package com.sandeep;

public class Animal {
    private int brain;
    private int body;
    private int weight;
    private String name;

    public Animal(int brain, int body, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void move() {
        System.out.println("Animal moving..");
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
