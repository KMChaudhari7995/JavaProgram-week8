package methodoverriding24;
/*
//Test class to create objects and call the methods
 */

public class Test2 {
    public static void main(String[] args) {    //main method
        SBI s = new SBI();  //object calling
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); //print statement
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
    }

