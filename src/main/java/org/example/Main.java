package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Print Menu
        System.out.println("Enter your party affiliation: ");
        System.out.println("[D]emocrat");
        System.out.println("[R]epublican");
        System.out.println("[I]ndependent");
        // get input
        System.out.print("> ");

        String affiliation = in.nextLine().toUpperCase(); // converts the string into an uppercase for easy checking
        in.nextLine();
        // If statements
        if(affiliation.equals("D")){
            System.out.println("You get a Democratic Donkey");
        } else if(affiliation.equals("R")){
            System.out.println("You get a Republican Elephant");
        } else if(affiliation.equals("I")){
            System.out.println("You get a Independent Person");
        } else {
            System.out.println("You said your affiliation was: " + affiliation);
            System.out.println("Run the program again and enter a valid affiliation [D,R,I]!");
        }
    }
}