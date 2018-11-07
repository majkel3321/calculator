package com.kodilla.calculator;
import java.util.*;

import java.util.*;




public class Calculator {

    public int sum(int x, int y){

        return x + y;
    }

    public int substract(int x, int y){

        return x - y;
    }

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        Calculator calculation = new Calculator();


        System.out.println("CALCULATOR");
        System.out.println("Select one option:");
        System.out.println("1. +");
        System.out.println("2. -");
        int choice = input.nextInt();

        switch(choice){

            case 1 :
                System.out.print("x = ");
                int x = input.nextInt();
                System.out.print("y = ");
                int y = input.nextInt();

                System.out.println(x + " + " + y + " = " + calculation.sum(x,y));

                break;

            case 2:
                System.out.print("x = ");
                x = input.nextInt();
                System.out.print("y = ");
                y = input.nextInt();

                System.out.println(x + " - " +  y  + " = " + calculation.substract(x,y));

                break;

            default:
                System.out.println("Command not recognized!");
                break;




        }









    }
}
