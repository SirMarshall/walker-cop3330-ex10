/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variables
        Scanner input = new Scanner(System.in);
        int itemOnePrice,itemOneQuantity,itemTwoPrice,itemTwoQuantity,itemThreePrice,itemThreeQuantity;
        double subtotal, tax, total;

        //Query item 1
        System.out.println( "Enter the price of item 1:" );
        itemOnePrice = input.nextInt();

        System.out.println("Enter the quantity of item 1:");
        itemOneQuantity = input.nextInt();

        //Query item 2
        System.out.println( "Enter the price of item 2:" );
        itemTwoPrice = input.nextInt();

        System.out.println("Enter the quantity of item 2:");
        itemTwoQuantity = input.nextInt();

        //Query item 3
        System.out.println( "Enter the price of item 3:" );
        itemThreePrice = input.nextInt();

        System.out.println("Enter the quantity of item 3:");
        itemThreeQuantity = input.nextInt();

        //Calculations
        subtotal = itemOnePrice * itemOneQuantity + itemTwoPrice * itemTwoQuantity + itemThreePrice * itemThreeQuantity;
        tax = subtotal * 0.055;
        total = subtotal + tax;

        //Final output
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);

    }
}
