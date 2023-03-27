package javaweek8;
/*
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program11_EvenDigitSum {

    public static void main(String[] args) {        //main method
        // getEvenDigitSum(123456789);
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));

    }

    public static int getEvenDigitSum(int number) {      //static method
        int total = 0; //variable declaration
        int rem;
        if (number > 0) {       //if condition
            while (number != 0) {       //while condition checking
                rem = number % 10;
                if (rem % 2 == 0) {
                    //  System.out.println(rem + " is a even digit");
                    total = total + rem;
                }
                number = number / 10;
            }
            return total;
        }
        return -1;
    }
}
