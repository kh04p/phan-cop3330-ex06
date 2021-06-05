/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;
import java.util.Calendar; //to get time & date from system

//program to get age and retirement age from user to calculate amount of time before retirement and retirement year
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR); //gets current year from system
        System.out.print("What is your current age? ");
        int age = (int) input.nextInt();
        System.out.print("At what age would you like to retire? ");
        int ageRetire = (int) input.nextInt();
        System.out.println("You have " + retire.diff(age, ageRetire) + " years left before you can retire.");
        System.out.println("Since it's currently " + year + ", you can retire in " + retire.year(year, retire.diff(age, ageRetire)));
    }
}
