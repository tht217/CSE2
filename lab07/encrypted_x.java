////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/09/2015
//CSE 002
//lab07: encrypted x
//
//This program will take an ISBN number and
//check its validity.

//import the scanner class
import java.util.Scanner;
//define a class
public class encrypted_x{
//adding a method
    public static void main(String[] args) {
//Scanner
Scanner myScanner = new Scanner( System.in );    

//initialize input
String inputSize="1";
int Size;

 //prompt user x size
        System.out.print("What size between 0 and 100 would you like? : ");
//Input loop to infinitely check for valid input.
do{
    try{
        //save input to string
        inputSize = myScanner.next();
        //save input to variable Size
        Size = (int)(Integer.parseInt(inputSize));
        if(Size>100 || Size<0){
            System.out.print("Invalid input. Size must be between 0 and 100: ");   
        }
        else{
            break;
        }
    }
    //The catch will stop the error from an inputted string type and prompt the user again.
    catch(IllegalArgumentException e){
        System.out.print("Invalid input. Please enter an integer size between 0 and 100: ");
    }
}while(true);

//To put the result on the next line
System.out.println("");
//Loop each row
for(int i=0; i<Size; i++){
    //Loop each column
    for(int j=0; j<Size; j++){
        if(j==i || j==(Size-i-1)){//if the column is where the x will be
            System.out.print(" ");
        }
        else{//otherwise, print the asterisk
            System.out.print("*");
        }
    }
    //move to the next row
    System.out.print("\n");
}
    }
}
