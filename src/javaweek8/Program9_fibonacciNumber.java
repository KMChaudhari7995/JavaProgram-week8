package javaweek8;
/*
. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class Program9_fibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner use
        System.out.println("Enter the number: "); //print statement
        int n = scan.nextInt(); // value store
        Program9_fibonacciNumber obj = new Program9_fibonacciNumber(); //object creation
        obj.fibonacciNumber(n); //method calling
        scan.close();

    }

    public void fibonacciNumber(int number) //instance method
    {
        int n1 = 0;  //variable declaration
        int n2 = 1;
        int n3;
        System.out.println("The fibonacci series upto" + number + "number is : "); //print statement
        System.out.println(n2);
        for (int i = 2; i <= number; i++) {
            n3 = n1 + n2;
            System.out.println(" " + n3); //print statement
            n1 = n2;
            n2 = n3;
        }
    }

}
