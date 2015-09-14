////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/15/2015
//CSE 002
//hw03 Program 1
//
//This program will:
//Compute the volume and surface area of a block
//
//import the scanner class
import java.util.Scanner;

//define a class
public class Block{
//adding a method
    public static void main(String[] args) {

//Scanner
Scanner myScanner = new Scanner( System.in );

//Prompt user for dimension x
System.out.print("Length: ");
//Save dimension X
double X = myScanner.nextDouble();

//Prompt user for dimension y
System.out.print("Width: ");
//Save dimension Y
double Y = myScanner.nextDouble();

//Prompt uer for dimension z
System.out.print("Height: ");
//Save dimension Z
double Z = myScanner.nextDouble();

//Declare surface area and volume
double SA,V;

//Calculate surface area and volume
SA = 2*((X*Y)+(X*Z)+(Y*Z));
V = X*Y*Z;

System.out.println("Surface Area = "+SA+"");
System.out.println("Volume = "+V+"");
}
}