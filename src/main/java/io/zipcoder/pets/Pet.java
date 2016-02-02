package io.zipcoder.pets;

/**
 * Created by connorjgelinas on 2/1/16.
 */
public class Pet {

    public Pet() {}
    protected String name;
    protected String speak;
    protected int feet;
    protected boolean fur;

    public String speak(String s) {
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}

class Dog extends Pet {
    public Dog() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
}

class Cat extends Pet {
    public Cat() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
}

class Bird extends Pet {
    public Bird() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
}

class Snake extends Pet {
    public Snake() {
    }
    @Override
    public String speak(String s) {
        return s;
    }
}