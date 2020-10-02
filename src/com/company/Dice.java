package com.company;

//Dice.java for creation of dice and rolling dice
public class Dice
{
    //Exercise 9
    private static int sides;

    public Dice(int x)
    {
        sides = x;
    }


    /**
     * Rolls a die - generates a random number in the range 1 .. 6
     * @return the face value of the die
     */
    public int roll()
    {
        return (int) (Math.random()*sides) + 1;
    }
    public String toString(){
        return "sides = " + sides;
    }

}