package com.sandeep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal(1, 1, 5, "Animal");
        Dog dog = new Dog(1, "puppy", 2, 4, 1, 10, "rough");
        dog.eat();
    }
}
