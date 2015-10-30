////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/30/2015
//CSE 002
//lab10: Arrays
//
//This program will create a 1-d array of strings to take names,
//and a 1-d array of ints to take grades.



//import the scanner class
import java.util.Scanner;
//define a class
public class Arrays{
    public static void main(String[] args){
        //make random length between 5 and 10
        int size;
        //find size of arrays bet 5 and 10
        size=((int)(Math.random()*6))+5;
        //declare and allocate arrays
        String []students = new String[size];
        int[] midterm = new int[size];
        
        //Prompt user for input
        System.out.println("Please enter "+size+" names of students.");
        for(int i=0; i<size; i++){
            //Scanner
            Scanner myScanner = new Scanner( System.in );
            //save value
            students[i] = myScanner.next();
        }
        System.out.println("The students' grades are as follows:");
        for(int i=0; i<size; i++){
            midterm[i]=((int)(Math.random()*101));
            
            System.out.println(students[i]+" : "+midterm[i]+" points");
        }
        
        
        
    }
}