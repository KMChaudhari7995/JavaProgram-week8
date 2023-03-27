package javaweek8;
/*
Write a program in Java to display the pattern like a triangle with a number.
 For ex.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */

import java.util.Scanner;

public class Program6_TriangleNumber {
    public static void main(String[] args) {            //main method
        Program6_TriangleNumber obj = new Program6_TriangleNumber(); //instance method calling
        obj.triangle();

    }

    public void triangle() {
        Scanner scan = new Scanner(System.in); //read the output from console
        System.out.println("Enter the number of rows: ");
        int n = scan.nextInt();

        //logic for print the numbers in triangle form

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j); //output
            }
            System.out.println(" ");        //for space print statement
        }
        scan.close();
    }
}
