package com.company;

import java.util.Arrays;
public class counterer{

    private int[] amount = new int[11]; //Creating an array for each value

    public counterer(int x){ //Creating the constructor
        Arrays.fill(amount, x);
    }

    public void updateValue(int y){
        amount[y-2]++; //Adding one to the correct value
    }
    public int getValue(int z){
        return amount[z]; //Returning the value in the correct space
    }
}