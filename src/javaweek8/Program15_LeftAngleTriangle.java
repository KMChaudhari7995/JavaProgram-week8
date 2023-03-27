package javaweek8;
/*
15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */

import java.util.Scanner;

public class Program15_LeftAngleTriangle {
    public static void main(String[] args) {        //main method
        Scanner scan = new Scanner(System.in);          //scanner use
        System.out.println("Enter the number of rows : ");  //print statement
        int n = scan.nextInt(); //value store from console

        //logic to print triangle
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                //  System.out.println(" ");
                System.out.print("*"); //print statement
            }
            System.out.println(" "); //print statement
        }
        scan.close();//scanner close
    }
}
