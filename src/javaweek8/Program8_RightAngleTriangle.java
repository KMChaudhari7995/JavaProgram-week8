package javaweek8;
/*
 Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
import java.util.Scanner;

public class Program8_RightAngleTriangle {

    public static void main(String[] args) {            //main method
        Program8_RightAngleTriangle obj = new Program8_RightAngleTriangle();        //instance method calling
        obj.rightAngleTriangle();

    }

    public void rightAngleTriangle()        //instance method
    {
        Scanner scan = new Scanner(System.in);      //scanner use
        System.out.println("Enter the number of rows : ");
        int n= scan.nextInt();

        //logic to print triangle
        for(int i = 1; i<=n ; i++){
            for(int j =1; j <=i; j++){
                System.out.print("@");      //print statement
            }
            System.out.println(" ");
        }
        scan.close();
    }


}
