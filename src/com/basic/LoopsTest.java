package com.basic;

public class LoopsTest {
    public static void main(String[] args) {

        // while loop demo
        int x = 1;
        while(x <= 4)
        {
            System.out.println("Value of x: " + x++);
        }

        // for loop demo
        for (int i = 1; i <= 4; i++)
            System.out.println("Value of x: " + i);

        // Enhanced For Loop
        String array[] = {"Ron", "Harry", "Hermoine"};
        for (String s: array)
        {
            System.out.println(s);
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        // do while demo
        int y = 21;
        do
        {
            System.out.println("Value of y: " + y++);
        }
        while (y < 20);

        // avoid infinite loop
    }
}

