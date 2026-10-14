package com.pluralsight;

public class VariableApp {

    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //STEP 1
        String favColor = "red";
        System.out.println("My favorite color is " + favColor);
        int startYear = 2026;
        System.out.println("I started this class in " + startYear);
        char midInitial = 'F';
        System.out.println("My middle initial is " + midInitial);
        boolean hasPets = true;
        if(hasPets){
            System.out.println("Yes I have a pet");
        }else{
            System.out.println("No I dont have a pet");
        }
        String niceMsg = "You are amazing!";
        System.out.println(niceMsg);

        System.out.println();

        //STEP 2
        int numDaysInWeek = 7;
        double price = 4.99;
        char favLetter = 'F';
        boolean isRaining = false;

        System.out.println("There are " + numDaysInWeek + " in a week.");
        System.out.println("A cup of coffe costs $" + price);
        System.out.println("My favorite letter is " +favLetter);
        if(isRaining){
            System.out.println("Yes it is raining.");
        }else{
            System.out.println("It is not raining right now.");
        }

    }
}
