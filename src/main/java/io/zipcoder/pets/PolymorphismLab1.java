package io.zipcoder.pets;

import java.util.*;

/**
 * Created by connorjgelinas on 2/1/16.
 */

public class PolymorphismLab1 {

    Scanner sc = new Scanner(System.in);
    int numPets;
    ArrayList<String> petTypes = new ArrayList();

    public PolymorphismLab1() {
        promptUser("How many pets do you have?");
        userPetNum();
        petTypes("What kind of animal do you have?");
        printer();
    }

    public void promptUser(String q) {
        System.out.println(q);
    }

    public int userPetNum() {
        numPets = sc.nextInt();
        return numPets;
    }

    public ArrayList petTypes(String q) {
        for (int i = 0; i < numPets; i++) {
            System.out.println(q);
            petTypes.add(sc.next());
        }
        return petTypes;
    }

    public void printer() {
        System.out.print("So you mean to tell me that you have a ");
        for (int i = 0; i < numPets; i++) {
            System.out.print(petTypes.get(i) + " ");
        }

    }


    public static void main(String[] args) {

        PolymorphismLab1 polyLab = new PolymorphismLab1();
        Dog rufus = new Dog();
        rufus.setName("Chucklehead");
        System.out.println(rufus.name);
    }
}
