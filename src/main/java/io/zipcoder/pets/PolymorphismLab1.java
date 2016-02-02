package io.zipcoder.pets;

import java.util.*;

/**
 * Created by connorjgelinas on 2/1/16.
 */

public class PolymorphismLab1 {

    Scanner sc = new Scanner(System.in);
    int numPets; //Number of pets the user has
    ArrayList<Pet> petTypes = new ArrayList(); //Array list of user's pets


    public PolymorphismLab1() {
        getUserPets();
    }


    //Asks user any question defined in the parameters
    public void promptUser(String q) {
        System.out.println(q);
    }

    //Asks user to tell us how many pets they have
    public int userPetNum() {
        numPets = sc.nextInt();
        return numPets;
    }


    //The types of pets the user has are output by iterating through
    //the arraylist and identifying each element's object type
    public void printer() {
        Iterator petIterator = petTypes.iterator();
        for (int i = 0; i < numPets; i++) {
            Object o = petIterator.next();
            if(o instanceof Dog) {
                Dog dog = new Dog();
                System.out.println(petTypes.get(i).name + " says " + dog.speak("woof!"));
            }
            if(o instanceof Cat) {
                Cat cat = new Cat();
                System.out.println(petTypes.get(i).name + " says " + cat.speak("meow!"));
            }
            if(o instanceof Bird) {
                Bird bird = new Bird();
                System.out.println(petTypes.get(i).name + " says " + bird.speak("tweet!"));
            }
            else if(o instanceof Snake) {
                Snake snake = new Snake();
                System.out.println(petTypes.get(i).name + " says " + snake.speak("hiss!"));
            }
        }
    }


    //Ask user for number of pets, then for that number, ask the type and name of each. Store in petTypes array list
    public void getUserPets() {
        Pet pet = new Pet();
        promptUser("How many pets do you have?");
        userPetNum();
        for (int i = 0; i < numPets; i++) {
            promptUser("What kind of pet do you have");
            String thisPet = sc.next();
            switch (thisPet.toLowerCase()) {
                case "dog":
                    Dog dog = new Dog();
                    petTypes.add(dog);
                    dog.cutePrint();
                    dog.setName(dog.name = sc.next());
                    break;
                case "cat":
                    Cat cat = new Cat();
                    petTypes.add(cat);
                    cat.cutePrint();
                    cat.setName(cat.name = sc.next());
                    break;
                case "bird":
                    Bird bird = new Bird();
                    petTypes.add(bird);
                    bird.cutePrint();
                    bird.setName(bird.name = sc.next());
                    break;
                case "snake":
                    Snake snake = new Snake();
                    petTypes.add(snake);
                    snake.cutePrint();
                    snake.setName(snake.name = sc.next());
                    break;
                default:
                    pet.cutePrint();
                    i--;
                    break;
            }
        }
        printer();
    }


    public static void main(String[] args) {

        PolymorphismLab1 polyLab = new PolymorphismLab1();
    }
}
