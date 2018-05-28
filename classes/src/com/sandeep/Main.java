package com.sandeep;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car maruti = new Car();

        System.out.println("Model : " + porsche.getModel());
	    porsche.setModel("Carrera");
        System.out.println("Model : " + porsche.getModel());
    }
}
