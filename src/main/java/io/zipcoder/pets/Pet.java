package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by connorjgelinas on 2/1/16.
 */
public class Pet {
    protected String name;
    protected String speak;
    protected int feet;
    protected boolean fur;
    Scanner sc = new Scanner(System.in);


    public String speak(String s) {
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public void cutePrint() {
        System.out.println("Wow how cute!");
    }
}

class Dog extends Pet {
    public Dog() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
    public void cutePrint() {
        System.out.println("Oh my gosh a doge! What's its name?");
    }
}

class Cat extends Pet {
    public Cat() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
    public void cutePrint() {
        System.out.println("Meh. A cat is okay. What's its name?");
    }
}

class Bird extends Pet {
    public Bird() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
    public void cutePrint() {
        System.out.println("*Gasp* A bird! What's its name?");
    }
}

class Snake extends Pet {
    public Snake() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
    public void cutePrint(){
        System.out.println("Sssssweeeettt dude what's its name?");
    }
}