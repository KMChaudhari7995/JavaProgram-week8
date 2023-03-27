package javaweek8;
/*
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Program12_PrimeNumber {
    public static void main(String[] args) // declaring main method
    {
        Scanner scan = new Scanner(System.in); // to read the input from the console
        System.out.println("Enter the number : ");
        int number = scan.nextInt();
        scan.close();
        Program12_PrimeNumber obj = new Program12_PrimeNumber(); // object creation to call an instance method
        obj.isPrimeOrNot(number); // calling Instance method
    }

    public void isPrimeOrNot(int number) // instance method
    {
        boolean prime = false;
        // logic to check whether the number is prime or not
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }
        if (!prime) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }
}
