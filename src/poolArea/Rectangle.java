package poolArea;

public class Rectangle {
    /**
     * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
     * width and length both of type double.
     * The class needs to have one constructor with parameters width and length both of type double and it
     * needs to initialize the fields.
     * In case the width parameter is less than 0 it needs to set the width field value to 0.
     * In case the length parameter is less than 0 it needs to set the length field value to 0.
     * Write the following methods (instance methods):
     * ● Method named getWidth without any parameters, it needs to return the value of the width
     * field.
     * ● Method named getLength without any parameters, it needs to return the value of the length
     * field.
     * ● Method named getArea without any parameters, it needs to return the calculated area
     * (width * length).
     */

    double width;
    double length;

    public Rectangle(double width, double length){
        if(width<0){
            this.width=0;
        }else{
            this.width = width;
        }

        if(length<0){
            this.length=0;
        }else{
            this.length= length;
        }
    }

    //Method named getWidth without any parameters, it needs to return the value of the width
    //field.
    public  double getWidth(){
        return this.width;
    }

    //Method named getLength without any parameters, it needs to return the value of the length
    //field.
    public double getLength(){
        return this.length;
    }

    //Method named getArea without any parameters, it needs to return the calculated area
    //(width * length).
    public double getArea(){
        return width* length;
    }
}

