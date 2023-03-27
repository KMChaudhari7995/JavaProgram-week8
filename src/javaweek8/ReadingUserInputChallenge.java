package javaweek8;
/*
. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge
 */

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {            //main method
        ReadingUserInputChallenge obj = new ReadingUserInputChallenge(); //instance method calling
        obj.readInput();
    }

    public void readInput() {
        int counter = 1;                //variable declaration
        int sum = 0;
        Scanner scan = new Scanner(System.in); //scanner for reading value
        //System.out.println("enter the number");

        while (counter <= 10) {   //checking condition
            System.out.println("Enter the number " + counter);          //print statement
            boolean checkNumber = scan.hasNextInt(); //boolean variable declaration
            if (checkNumber == true) {              //condition
                int number = scan.nextInt();
                sum = sum + number;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();


        }
        System.out.println("Sum of the all numbers " + sum); //print statement
        scan.close();

    }
}