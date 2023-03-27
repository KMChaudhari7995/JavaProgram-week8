package poolarea;

public class Rectangle {
    double width;//variable declaration
    double length;

    public Rectangle(double width,double length) //constructor
    {
        this.length=length;
        this.width=width;
        if(this.width<0){
            this.width=0;
        }else {
            this.width=width;
        }
        if(this.length<0){
            this.length=0;
        }else {
            this.length=length;
        }

    }
    public double getWidth(){       //method
        return width;
    }
    public double getLength() {         //instance method
        return length;
    }
    public double getArea(){            //instance method
        return width*length;
    }

}
