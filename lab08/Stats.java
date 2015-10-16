////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/16/2015
//CSE 002
//lab08: Stats
//
//This program will take the size of a twisty pattern and draw it.


//import the scanner class
import java.util.Scanner;
//define a class
public class Stats{
//adding a method
public static void main(String[] args) {

    //Scanner
    Scanner myScanner = new Scanner( System.in );    
    //Prompt user for input
    System.out.println("Please input 5 doubles from smallest to largest: ");

    //Intake 5 doubles:
    double var1=myScanner.nextDouble();
    double var2=myScanner.nextDouble();
    double var3=myScanner.nextDouble();
    double var4=myScanner.nextDouble();
    double var5=myScanner.nextDouble();

    double mean = mean5(var1,var2,var3,var4,var5);

    double median = median5(var1,var2,var3,var4,var5);

    print(mean,median);
}
   
//adding a method
public static double mean5 (double var1, double var2, double var3, double var4, double var5)
{
    //calculates mean
    double mean=(var1+var2+var3+var4+var5)/5;
    //returns mean
    return mean;
}

//adding a method
public static double median5 (double var1, double var2, double var3, double var4, double var5)
{
    //calculates median
    double median = var3;
    //returns median
    return median;
}
    
//void method to print
public static void print(Double mean, Double median) {
    
//Print results    
    System.out.println("The mean of the five values is: "+mean);
    System.out.println("The median of the five values is: "+median);
}
}