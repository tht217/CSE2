////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/18/2015
//CSE 002
//hw08, Program 2: String Analysis
//
//This program will read a string and tell the user if some or a specified
//number of characters are letters

//import java.io*;
//import the scanner class
import java.util.Scanner;
//define a class
public class StringAnalysis{
////////////////////////////////////////////////////////////////////////////////
//Main method
public static void main(String[] args) {
    
    //initialize string to be analyzed
    String object = "String";
    String docheck = "String";
    int test = 1;
    int answer = 0;
    boolean know;
    
    //Prompt user
    System.out.println("Enter your string: ");
    //Scanner
    Scanner myScanner = new Scanner( System.in );  
    //No need for string validity check - all inputs can be strings.
    object = myScanner.next();
    //Find length of string
    int objlength = object.length();
    //prompt user for amount to be checked
    System.out.println("How many digits would you like to check?");
    System.out.println("Either enter an integer or type 'all' : ");
    
    
    while(true){//loop to determine the amount of digits to be checked
        docheck = myScanner.next();
        //Check for proper input. Breaks loop if so.
        if (docheck.equals("all")){
            test = objlength;
            break;
        }
        else{
            //ParseInt creates an integer from the string input
            try{
                test = Integer.parseInt(docheck); //String ensures no hexadecimal input
                if(test>objlength){ //cannot test more digits than there are in the string.
                    test = objlength;
                    //Explanation to user
                    System.out.println("Only the "+test+" characters are in the string and will be checked.");
                    break;
                }
                else{
                    break;
                }
            }
            catch(IllegalArgumentException e){
                System.out.println("Your entry is invalid. Please enter a decimal integer or 'all' : ");
                
            }
        }
    }
    //If statements decide which method to call.
    if(test==objlength){
        know = checker1(object);
    }
    else{
        know = checker2(object, test);
    }
    //print answer
    System.out.println("Of "+test+" characters checked, the result was "+know+".");
    if(know){//all letters
    System.out.println("They were all letters.");
    }
    else{//not letters
    System.out.println("They were not all letters.");
    }
}


//Method to check all digits
public static boolean checker1 (String object){
    int amount = 0;
    //Incriments through all characters and checks
    for(int i=0;i<(object.length());i++){
        if(Character.isLetter(object.charAt(i))){
            amount = amount+1;
        }
        else{
            break;
        }
    }
    if(amount == object.length()){
        return true;
    }
    else{
        return false;
    }
}
public static boolean checker2 (String object, int test){
    int amount = 0;
    //Incriments through all characters and checks
    for(int i=0;i<(test);i++){
        if(Character.isLetter(object.charAt(i))){
            amount = amount+1;
        }
        else{
            break;
        }
    }
    if(amount == test){
        return true;
    }
    else{
        return false;
    }
}

}
    