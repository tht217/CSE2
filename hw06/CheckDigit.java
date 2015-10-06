////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/06/2015
//CSE 002
//lab06: Getting Loopy
//
//This program will take an ISBN number and
//check its validity.

//import the scanner class
import java.util.Scanner;
//define a class
public class CheckDigit{
//adding a method
    public static void main(String[] args) {
//Scanner
Scanner myScanner = new Scanner( System.in );    
//initialize ISBN var
long ISBN;
//initialize input string
String inputCode;
//loop to ensure 10-digits
do{
    try{
        //prompt user for code
        System.out.print("\nPlease enter your 10 digit ISBN: ");
        //save input to string
        inputCode = myScanner.next();
        //save input to variable ISBN 
        ISBN = (long)(Double.parseDouble(inputCode));
        //determine length of ISBN
        int length = inputCode.length();
        if (length == 10){
            break;
        }
        else{
            System.out.println("\nInvalid input. Please enter a 10 digit ISBN code: ");
        }
    }
    catch(IllegalArgumentException e){
        System.out.println("\nInvalid input. Please enter a 10 digit ISBN code: ");
    }
}while(true);
System.out.println(ISBN);

//separate digits into separate variables
int Digit1 = (int)(ISBN / 1000000000);
int Digit2 = ((int)(ISBN / 100000000)) % 10;
int Digit3 = ((int)(ISBN / 10000000)) % 10;
int Digit4 = ((int)(ISBN / 1000000)) % 10;
int Digit5 = ((int)(ISBN / 100000)) % 10;
int Digit6 = ((int)(ISBN / 10000)) % 10;
int Digit7 = ((int)(ISBN / 1000)) % 10;
int Digit8 = ((int)(ISBN / 100)) % 10;
int Digit9 = ((int)(ISBN / 10)) % 10;

//Authenticity formula to compare to the last digit
int Comparer = ((10*Digit1)+(9*Digit2)+(8*Digit3)+(7*Digit4)+(6*Digit5)+(5*Digit6)+(4*Digit7)+(3*Digit8)+(2*Digit9)) % 11;

//If statement to DETERMINE whether the ISBN is valid.
if(Comparer == (ISBN % 10)){//valid
    System.out.println("This is a VALID ISBN.");
}     
else{//invalid
    System.out.println("This is an INVALID ISBN. Check digit should be: "+Comparer);
}
    }
}