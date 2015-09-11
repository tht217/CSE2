////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/11/2015
//CSE 002
//lab03: Check splitting
//
//This program will:
//Calculate and split a check evenly.
//
//import the scanner class
import java.util.Scanner;

//define a class
public class Check{
//adding a method
    public static void main(String[] args) {

//Scanner
Scanner myScanner = new Scanner( System.in );

//Prompt user for original cost of check
System.out.print("Enter the original cost of the check in the form xx.xx: ");
//save check cost variable using 
double checkCost = myScanner.nextDouble();

//Prompt user for tip percentage
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
//save tip percent
double tipPercent = myScanner.nextDouble();
//Convert the percentage into a decimal value
tipPercent /= 100;

//Prompt user for number of people who went
System.out.print ("Enter the number of people who went out to dinner: ");
//save numper of people
int numPeople = myScanner.nextInt();

//Variables
double totalCost;
double costPerPerson;
int dollars, //whole dollar amount of cost
dimes, pennies; //for storing digits to the right of the decimal point

totalCost = checkCost * (1+tipPercent); //calculates total cost to be paid
costPerPerson = totalCost / numPeople; //total to be paid per person

dollars=(int)costPerPerson; //Number of dollars per person
dimes=(int)(costPerPerson * 10) % 10; //Number of dimes per person
pennies=(int)(costPerPerson * 100) %10; //number of pennies per person

//Print the amount due per person
System.out.println("Each person in the group owes: $"+dollars+'.'+dimes+pennies);
}
}