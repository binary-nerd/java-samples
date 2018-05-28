package com.sandeep;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog chewing..");
    }

}
