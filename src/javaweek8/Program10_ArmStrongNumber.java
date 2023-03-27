package javaweek8;
/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

import java.util.Scanner;

public class Program10_ArmStrongNumber {
    public static void main(String[] args) { //main method
        int number = 153;  //initialization
        int checkNumber, reminder, sum = 0;
        System.out.println("Enter the number for checking ArmStrongNumber");    //print statement
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        checkNumber = number;
        while (checkNumber != 0) {
            reminder = checkNumber % 10;
            sum = sum + (reminder * reminder * reminder);
            checkNumber = checkNumber / 10;
        }
        if (sum == number) {               //if statement
            System.out.println("Given number is an ArmStrong");
        } else {
            System.out.println("Given number is not an ArmStrong");
        }
        scan.close();
    }

}
