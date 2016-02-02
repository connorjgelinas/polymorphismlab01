package io.zipcoder.pets;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Test class for the Pet class hierarchy. Part of Polymorphism Lab 1
 */

public class SpecPet {

    //Classes to create
    Pet testPet;
    Dog testDog;
    Cat testCat;
    Bird testBird;
    Snake testSnake;


    //Instantiate here
    @Before
    public void resourcesNeededToTest() {
        testPet = new Pet();
        testDog = new Dog();
        testCat = new Cat();
        testBird = new Bird();
        testSnake = new Snake();
    }


    @Test
    public void givenADogShouldHaveUniqueSpeakMethod() {
        assertEquals("Dog should bark", "Bark!", testDog.speak("Bark!"));
    }

    @Test
    public void givenACatShouldHaveUniqueSpeakMethod() {
        assertEquals("Cat should meow", "Meow!", testCat.speak("Meow!"));
    }

    @Test
    public void givenABirdShouldHaveUniqueSpeakMethod() {
        assertEquals("Bird should chirp", "Chirp!", testBird.speak("Chirp!"));
    }

    @Test
    public void givenASnakeShouldHaveUniqueSpeakMethod() {
        assertEquals("Snake should hiss", "Hiss!", testSnake.speak("Hiss!"));
    }

    @Test
    public void givenADogShouldSubclassPet(){
        assertThat(testDog, instanceOf(Pet.class));
    }

    @Test
    public void givenACatShouldSubclassPet(){
        assertThat(testCat, instanceOf(Pet.class));
    }

    @Test
    public void givenABirdShouldSubclassPet(){
        assertThat(testBird, instanceOf(Pet.class));
    }

    @Test
    public void givenASnakeShouldSubclassPet(){
        assertThat(testSnake, instanceOf(Pet.class));
    }

    @Test
    public void petHasNameProperty(){
        String name = "Spot";
        String name2 = "Snowball";

        Pet snookums = new Pet();
        snookums.setName(name);
        assertEquals("Pet did not remember its name: " + name, name, snookums.getName());

        snookums.setName(name2);
        assertEquals("Pet did not remember its name: " + name2, name2, snookums.getName());

    }

}
