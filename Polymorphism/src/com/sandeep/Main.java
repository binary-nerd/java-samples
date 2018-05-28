package com.sandeep;

/*
* You can use a super calss and write the program. All of it
* will be valid even for its inherited classes. This is called
* polymorphism
*
* For example, in the main method below, the return type is of
* calss Movie. But we are returning class Jaws. It is perfectly
* ok as Jaws in inherited class of Class Movie.
*
* This allows us to write generic code or it is called as polymorphic
* code.
*
* */
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to takeover planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgettable");
    }

    // No plot
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println(movie.getName() + " plot : " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int rand = (int)(Math.random() * 4 + 1);

        switch (rand) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgetable();
        }

        return null;
    }
}
































