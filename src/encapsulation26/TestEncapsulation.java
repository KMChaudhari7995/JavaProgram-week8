package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {   //main method
        Encapsulate obj= new Encapsulate();
        //setting the values of the variables
        obj.setName("Khushi");
        obj.setAge(25);
        obj.setRollNo(79);

        //Displaying values of the variables
        System.out.println("Prime's name : "+obj.getName()); //print statement
        System.out.println("Prime's age : "+obj.getAge());
        System.out.println("Prime's rollNo : "+obj.getRollNo());
    }
}
