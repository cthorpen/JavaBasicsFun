package com.thorpen.cole;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * a block comment
 * (multi line comment)
 * the two stars denotes a javadoc comment (don't need javadoc for this class)
 */

/*
    one line comment
    every public type must be in its own file
    ex. Main in Main.java

     4 access modifiers
    1. public (accessible everywhere
    2. private
    3. protected
    4. package private (omit modifier)

    - command + J = shortcuts

    */

public class Main {

    //constant int
    public static final int CONSTANT_NUMBER = 5;

    static Boolean words(String first, String second) {
        //check if words are valid references
        if (first != null && second != null) {
            if (first.length() > 0 && second.length() > 0) {
                if (first.charAt(first.length() - 1) == second.charAt(second.length() - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //static means class-level (as opposed to instance-level)
        // said another way, static means no "this" reference
        // String[] is the type of the paramether args (cmd line args)

        //Variables
        // a variable in Java is either a primitive (8 types) or reference
        //1. char
        char myChar = 'a';
        //2. int
        //3. float
        //4. double
        double myDouble = 3.1415;
        System.out.println("myDouble: " + myDouble);
        //2 ways to format a double
        System.out.printf("%.2f\n", myDouble);
        DecimalFormat formatter = new DecimalFormat("#0.000");
        System.out.println(formatter.format(myDouble));
        // CONSTANTS
        // use the final keyword
        // use MACRO_CASE by convention...
        // ... (as opposed to camelCase for identifiers and PascalCase for types)
        System.out.println(Main.CONSTANT_NUMBER);
        System.out.println(Math.PI);
        //5. boolean
        boolean myBool = true; //false
        //6. long, 7. short, 8. byte

        //STRINGS
        // is of type String (the class)
        //means, we get access to attribute and methods (member functions)
        // lots of great string methods: charAt(), toCharArray(), trim(), toUpperCase(), etc...
        String myString = "welcome";
        System.out.println(myString);
        //task 1: declare two strings, one for your first name, and one for your last
        // print out <first name> <last name> has <# of letters> letters in it
        String firstName = "Cole";
        String lastName = "Thorpen";
        int numLetters = firstName.length() + lastName.length();
        System.out.println(firstName + " " + lastName + " has " + numLetters + " letters.");

        //ARRAYS (and a lil about LISTS)
        //similar to C++
        //can declare and initialize at same time
        int[] myInts = {3, 4, 5, 6};
        System.out.println("myInts: " + myInts); // prints out hashcode
        System.out.println("myInts: " + Arrays.toString(myInts));
        //task 2: create array of 4 names
        //print array, print number of elements, print last element
        final int NUM_FRIENDS = 4;
        String[] friendsNames = new String[NUM_FRIENDS];
        friendsNames[0] = "joey";
        friendsNames[1] = "monica";
        friendsNames[2] = "phoebe";
        friendsNames[3] = "chandler";
        System.out.println(Arrays.toString(friendsNames) + ", " + friendsNames.length + ", " + friendsNames[friendsNames.length-1]);

        //CONTROL FLOW
        // similar to C++
        // if/else, if/else switch, while, do/while, for, all same
        //range base for loop (for-each loop)
        for (String friend: friendsNames) {
            System.out.println(friend);
        }
        //task 3: print out first same 20 even numbers on the same line
        for (int i = 2; i <=40; i+=2) {
                System.out.printf(i + " ");
        }
        System.out.println("\n");

        //METHODS
        //also similar to C++
        // use static for class-level methods (dont need an object to invoke it)
        //task 4: define and call a static method that accepts two strings
        //return true if have same last letter, false if not
        // special cases???
        System.out.println(words("first", "last"));
        // can print out more

        //RANDOM NUMBERS
        //create a Random object
        Random random = new Random();
        int randInt = random.nextInt(10); // [0...10]
        System.out.println(randInt);

        //USER INPUT (not needed for Android)
        //use the Scanner class for input from keyboard (System.in) and from a File
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        int favNum = kb.nextInt();
        kb.nextLine(); // flush the pesky nextLine character out
        System.out.println("Fav number: " + favNum);
    }
}
