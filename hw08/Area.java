////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/18/2015
//CSE 002
//hw08, Program 1: Area
//
//This program will compute the area of a given shape

//import the scanner class
import java.util.Scanner;
//define a class
public class Area{
////////////////////////////////////////////////////////////////////////////////
//Main method
public static void main(String[] args) {
    //Initialize identifying type strings
    String rectangle = "rectangle";
    String triangle = "triangle";
    String circle = "circle";
    String Type = "Type";
    //initialize final variable as zero to ensure compilation
    double Area = 0;
    //Prompt user for type of shape
    System.out.println("____________________________________________________");
    System.out.println("Choose a shape from this list and enter it as shown:");
    System.out.println("'rectangle' , 'triangle' , 'circle'");
    System.out.println("Please enter it with no capitalization: ");
    //Scanner
    Scanner myScanner = new Scanner( System.in );  
    
    //infinite loop to ensure correct input
    while(true){
        Type = myScanner.next();
        //Check for proper input. Breaks loop if so.
        if (Type.equals(rectangle) || Type.equals(triangle) || Type.equals(circle)){
            break;
        }
        //Prompt user for proper input.
        else{
            System.out.println("The shape type is invalid. They are as shown:");
            System.out.println("'rectangle' , 'triangle' , 'circle'");
            System.out.println("Please enter it with no capitalization: ");
        }
    }
    
    //depending on the type, a different method will be called.
    if(Type.equals(rectangle)){
        Area = rectanglearea();

    }
    if(Type.equals(triangle)){
        Area = trianglearea();
    }
    if(Type.equals(circle)){
        Area = circlearea();
    }

    System.out.println("The area of the given "+Type+" is "+Area);
    
}
////////////////////////////////////////////////////////////////////////////////
//Method for rectangle
public static double rectanglearea (){

    //Prompt user
    System.out.print("Enter the rectangle's length: ");
    //Call method to infinitely loop and check for valid length input.
    double length = inputcheck();

    //Prompt user
    System.out.print("Enter the rectangle's width: ");
    //Call method to infinitely loop and check for valid width input.
    double width = inputcheck();
    
    //calculate area
    double Area = length * width;

    //return area
    return Area;
   
}
////////////////////////////////////////////////////////////////////////////////
public static double trianglearea(){ //NOTE: the input is exactly the same here.
   //Prompt user
    System.out.print("Enter the triangle's base: ");
    //Call method to infinitely loop and check for valid base input.
    double base = inputcheck();
    //Prompt user
    System.out.print("Enter the triangle's height: ");
    //Call method to infinitely loop and check for valid height input.
    double height = inputcheck();
    //calculate area
    double Area = (base * height) / 2;
    //return area
    return Area;
}
////////////////////////////////////////////////////////////////////////////////
public static double circlearea(){
    //Prompt user
    System.out.print("Enter the circle's radius: ");
    //Call method to infinitely loop and check for valid radius input.
    double radius = inputcheck();
    
    //calculate area
    double Area = Math.PI * (radius*radius);
    //return area
    return Area;
    
}
////////////////////////////////////////////////////////////////////////////////
public static double inputcheck(){
    
    //Scanner
    Scanner valuescan = new Scanner( System.in );  
    
    //initialize dim
    String stringdim = "string";
    double dim;
    do{
        try{
            //Save value
            stringdim = valuescan.next();
            //save as an integer, 100 times the value in an array
            dim = Double.parseDouble(stringdim);
            //successful value entered
            break;
        }
        catch(IllegalArgumentException e){
            System.out.print("Sorry, you did not enter a double. Try again: ");
        }
    }while(true);

    
    //return the value
    return dim;
}

}