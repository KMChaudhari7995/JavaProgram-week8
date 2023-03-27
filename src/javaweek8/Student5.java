package javaweek8;
//Program25

public class Student5 {

    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5(int i, String n) { //constructor
        id = i;
        name = n;

    }

    Student5(int i, String n, int a) {  //constructor
        id = i;
        name = n;
        age = a;
    }

    public void display() {  //instance method
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {        //main method
        Student5 s1 = new Student5(111, "Karan"); //print statement
        Student5 s2 = new Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
