package encapsulation26;

public class Encapsulate {
    // private variables declared these can only be
   // accessed by public methods of class

    private String name; //variable declaration
    private int rollNo;
    private int age;
    // get method for name to access private variable name


    public String getName() {       //instance method
        return name;
    }

    public void setName(String name) {      //instance method
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
