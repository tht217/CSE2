////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/09/2015
//CSE 002
//hw07: Twisty
//
//This program will take the size of a twisty pattern and draw it.

//import the scanner class
import java.util.Scanner;
//define a class
public class Twisty{
//adding a method
    public static void main(String[] args) {
//Scanner
Scanner myScanner = new Scanner( System.in );    

//initialize input variables
String lengthString="string";
int length;
String widthString="string";
int width;
//initialize boolean flag
boolean flag = false;
//initialize odd or even variable
String oddeven = "string";
//initialize end variable used in loop
int end;

//Prompt for length
System.out.print("Enter the desired length: ");
//Input loop to infinitely check for valid length.
do{
    try{
        //save input to string
        lengthString = myScanner.next();
        //save input to variable length
        length = (int)(Integer.parseInt(lengthString));
        if(length>80 || length<1){
            System.out.print("Invalid input. Length must be between 1 and 80: ");   
        }
        else{
            break;
        }
    }
    //The catch will catch an error before the system stops the program and repeat the loop.
    catch(IllegalArgumentException e){
        System.out.print("Invalid input. Please enter an integer size between 0 and 80: ");
    }
}while(true);
//prompt user for width
System.out.print("Enter the desired width: ");
do{
    try{
        //save input to string first
        widthString = myScanner.next();
        //save input to variable width
        width = (int)(Integer.parseInt(widthString));
        if(width>length || width<1){
            System.out.print("Invalid input. Width must be between 1 and the length: ");   
        }
        else{
            break;
        }
    }
    //The catch will stop the error from an inputted string type and prompt the user again for width.
    catch(IllegalArgumentException e){
        System.out.print("Invalid input. Please enter an integer size between 0 and 80: ");
    }
}while(true);

//number of xs to be printed
int numV=length/(width*2);
//remainder length of x
int remV=length-(numV*width*2);
//check for odd or even size
if ((width%2)==0){
oddeven = "even";
}
else{
oddeven = "odd";
}

//Add space between pattern and input lines
System.out.println("\n");

//Triple nested for loop
for(int i=0; i<width; i++){ //loop across rows
    for(int j=0; j<=numV; j++){ //loop across each pattern repetition 
        if(j<numV){//for full patterns
            end = width*2;
        }
        else{//for last pattern
            end =   remV;
        }
        for(int k=0; k<end; k++){ //across columns within each pattern
            if (k==i || k==((width*2)-i-1)){//in the correct spots, print a #
                //in the case of an odd width, print \ at the correct point (alternate # and \)
                if(oddeven.equals("odd")&&k==(width-1+((width+1)/2))){
                    System.out.print("\\");
                }//otherwise, print #
                else{
                    System.out.print("#");
                }                    
            }
            else if (k==(width-i-1)){//if that isn't true, print / in the correct spot
                System.out.print("/");
            }
            else if (k==(width+i)){// if that isn't true, print \ in the correct spot
                System.out.print("\\");
            }
            else{// print filler spaces
                System.out.print(" ");
            }
        }
    }
    //Move to the next row
    System.out.print("\n");
}

//Cosmetic space
System.out.print("\n");
    }
}