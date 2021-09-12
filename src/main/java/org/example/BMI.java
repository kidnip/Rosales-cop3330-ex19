package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class BMI
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float weight, height, result;

        System.out.print("What is your weight (in pounds)? ");
        weight = input.nextFloat();
        System.out.print("What is your height (in inches)? ");
        height = input.nextFloat();

        result = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f\n", result);
        if(result >= 25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if (result < 25 && result >= 18.5) {
            System.out.println("You are within the ideal weight range.");
        } else {
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}
