package javaweek8;
/*/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 *
 ***
 *****
 *******
 *********
 ***********
 *************
 ***********
 *********
 *******
 *****
 ***
 */

import java.util.Scanner;

public class Program14_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner use
        System.out.print("Enter number : ");    //print statement
        int n = scan.nextInt();
        diamond(n);     //static method calling
        scan.close(); //scan close

    }

    public static void diamond(int n) {         //static method
        int i = 1; //variable initialization
        int k, j;
        while (i <= n) {        //while loop
            k = 1;
            while (k <= n - i) {
                System.out.print(" ");
                k++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            k = n;
            while (k > i) {
                System.out.print(" ");
                k--;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;

        }
    }
}