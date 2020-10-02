package com.company;
/*
Jacob Choi
9/18/2020
Dice Lab 2
Extra: Letting the user choose how many sides the dice have
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        // Setup
        Scanner in = new Scanner(System.in);
        Dice d = new Dice(6); //Defnining dice to use for rest of lab
        int die1, die2, sum, temp = 0, dieSides1, dieSides2, choice, counter=0; //Defining variables for use later on
        // Exercises 1-6
        //Asking user how many times they would like to roll the dice to count (choices) sum
        System.out.println("How many rolls would you like?");
        int rolls = in.nextInt();
        //Asking user which sum they would like to count throughout (rolls) amount of rolls
        System.out.println("Which sum would you like to count?");
        choice = in.nextInt();
        System.out.format("%-20s %-20s %-20s", "Die 1: ", "Die 2: ", "Sum: "); //Header for output
        System.out.println();
        //For loop to roll dice repeatedly and summing it
        for (int i = 0; i < rolls; i++) {
            die1 = d.roll();
            die2 = d.roll();
            sum = die1 + die2;
            //If the sum user inputs is rolled it counts it
            if(sum == choice)
                counter++;
            //Format for each roll
            System.out.format("%-20s %-20s %-20s", die1, die2, sum);
            System.out.println();
        }
        //outputting the results
        System.out.println("Rolled " + choice + " " + counter + " times");


        //Exercise 7
        counter = 0; //resetting the counter
        die1 = 1; //resetting the die ints, will happen for each new excercise
        die2 = 2;
        //while loop checking if its a double
        while(die1 != die2) {
            die1 = d.roll();
            die2 = d.roll();
            counter++; //counting how many tries it takes to get a double
        }
        System.out.println(counter + " tries to get a double: " + die1 + " + " + die2 + " = " + (die1 + die2));    //outputting how many tries it took and what the double was


        // Exercise 8
        die1 = 1; //resetting the dice
        die2 = 2;
        counter = 0; //resetting counter
        do {
            die1 = d.roll();
            die2 = d.roll();
            counter++;
        }
        while(die1 != die2); //same while loop check as last exercise
        System.out.println(counter + " tries to get a double: " + die1 + " + " + die2 + " = " + (die1 + die2));

        //Exercise 10 + 12
        //Extra letting the user choose how many sides each die has
        System.out.println("How many sides would you like the first die to have?");
        dieSides1 = in.nextInt();
        System.out.println("How many sides would you like the second die to have?");
        dieSides2 = in.nextInt();
        //Creating the new dice and printing out the number of sides
        Dice g = new Dice(dieSides1);
        System.out.println(g.toString());
        Dice g2 = new Dice(dieSides2);
        System.out.println(g2.toString());
        //Exercise 12
        Dice e = new Dice(6);
        int[] counters = new int[11]; //creating an array to count how many times each sum is rolled
        die1 = 0; //resetting the die ints
        die2 = 0;
        counterer c = new counterer(0);
        for(int i=0;i<10000;i++){ //rolling the dice 10000 times and counting each sum in the correct spot in the array
            die1 = e.roll();
            die2 = e.roll();
            temp = die1+die2;
            c.updateValue(temp);
        }
        for(int i=0;i<11;i++){ //Printing out how many times each sum was rolled
            System.out.println(i+2 + ": " + c.getValue(i));
        }
    }
}

