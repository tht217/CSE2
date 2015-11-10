////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//11/03/2015
//CSE 002
//hw10: Shuffling
//
//This program searches an array of grades for any value

//Import scanner
import java.util.Scanner;
//define a class
public class CSE2Linear{
    public static void main(String[] args){

        //declare and allocate arrays
        int[] grades = new int[5000];
        
        //prompt user for grade
        System.out.println("Please enter the grades: ");
        //build grades array
        for(int i=0; i<15; i++){
            //call input method to save values
            if (i==0){
                grades[i] = input(0);
            }
            else{
                grades[i] = input(grades[i-1]);
            }
        }
        
        
        print(grades);//print initial array
        searcher(grades);//search initial
        int[] newgrades = sort(grades);//call scrambler
        print(newgrades);//print scrambled array
        searcher(newgrades);//search scrambled
        
        
    }
    
    public static int input(int last){
        //declare value to be returned
        int value;
        do{
            //Scanner
            Scanner myScanner = new Scanner( System.in );    
            try{
                
                //save input to string
                value = myScanner.nextInt();
                //check value vs old value
                if (value>=last && value>=0 && value<=100){  
                    break;
                }
                if (value<last){
                    System.out.println("Grade must be greater than or equal to the last entered."); 
                }
                if (value<0 || value>100){
                    System.out.println("Grade must be between 0 and 100.");
                }
            }
            catch(Exception e){
                System.out.println("Grade not entered correctly. Enter an integer: ");
            }
        }while(true);
        return value;
    }
    public static void searcher(int[] grades){
        //Scanner
        Scanner myScanner = new Scanner( System.in );  
        //Prompt user for grade to be searched for
        System.out.println("Enter a grade to be searched for: " );
        //save input to string
        int check = myScanner.nextInt();
        
        //linear search
        for(int i=0; i<16; i++){
            if(grades[i]==check){
                int j=i+1;
                System.out.println(check+" is one of the final grades.");
                System.out.println("Iterations used:"+j);
                break;
            }
            if(i==15){
                System.out.println("There are no instances of the grade "+check);
            }
        }
    }
    public static int[] sort(int[] grades){
        for(int i=0;i<30;i++){
            int hah = (int)(Math.random()*14)+1;
            int placeholder = grades[hah];
            grades[hah] = grades[0];
            grades[0] = placeholder;
        }
        return grades;
    }
    public static void print(int[] grades){//prints any array up to 15
        System.out.print("Grades: ");
        for(int i=0; i<15; i++){
            System.out.print(grades[i]+" ");
        }
        System.out.println("");
    }
}