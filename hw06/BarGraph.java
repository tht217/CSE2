////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//10/06/2015
//CSE 002
//lab06: Getting Loopy
//
//PART 1 will:
//Keep track of expenses over a week
//Print a bar graph tracking expenses
//PART 2 will:
//Take an average of those expenses
//Estimate future expenses

//import the scanner class
import java.util.Scanner;
//define a class
public class BarGraph{
//adding a method
    public static void main(String[] args) {
     
//initialize the expense string   
String StringExpense;
int[] ExpenseArray = new int[8];
//initialize variable level
int level;

//PART 1
System.out.println("Enter expenses in the form XX.XX");
//Scanner
Scanner myScanner = new Scanner( System.in );

//loop to take input every day of the week
for (int day=1; day<8; day++){

if (day==1){//Prompt user for Sunday expenses
    System.out.print("Sunday: $");
}
if (day==2){//Prompt user for Monday expenses
    System.out.print("Monday: $");
}
if (day==3){//Prompt user for Tuesday expenses
    System.out.print("Tuesday: $");
}
if (day==4){//Prompt user for Wednesday expenses
    System.out.print("Wednesday: $");
}
if (day==5){//Prompt user for Thursday expenses
    System.out.print("Thursday: $");
}
if (day==6){//Prompt user for Friday expenses
    System.out.print("Friday: $");
}
if (day==7){//Prompt user for Saturday expenses
    System.out.print("Saturday: $");
}

//do while loop to ensure an integer input
do{
    try{
        //Save value
        StringExpense = myScanner.next();
        //save as an integer, 100 times the value in an array
        ExpenseArray[day] = (int)((Double.parseDouble(StringExpense))*100);
        //successful value entered
        break;
    }
    catch(IllegalArgumentException e){
        System.out.print("Sorry, you did not enter the value in the proper format. Try again: $");
    }
}while(true);
}
//Find the daily average, to be used in part 1 and part 2
int Sum = (ExpenseArray[1]+ExpenseArray[2]+ExpenseArray[3]+ExpenseArray[4]+ExpenseArray[5]+ExpenseArray[6]+ExpenseArray[7]);
double Avg = Sum/700.0;

//Make asterisk bar graph via loop for each day
for (int day=1; day<8; day++){
    
if (day==1){//print Sunday bar
    System.out.print("\nSun: ");
}
if (day==2){//print Monday bar
    System.out.print("\nMon: ");
}
if (day==3){//print Tuesday bar
    System.out.print("\nTue: ");
}
if (day==4){//print Wednesday bar
    System.out.print("\nWed: ");
}
if (day==5){//print Thursday bar
    System.out.print("\nThu: ");
}
if (day==6){//print Friday bar
    System.out.print("\nFri: ");
}
if (day==7){//print Saturaday bar
    System.out.print("\nSat: ");
}
    //Find size of bar
    if(ExpenseArray[day] % 100 < 50){
        level = (int)(ExpenseArray[day]/100);
    }
    else{
        level = ((int)(ExpenseArray[day]/100))+1;
    }
        //loop to print correct number of asterisks
        for(int j=0; j<level; j++){
            System.out.print("*");
    }
}
//////////////////////////////////////////////////////
//PART 2
//initialize total expenditure
double TotalExpenditure = 7*Avg;
//for loop to determine predicted 4 year expenditure
for(int week=0; week<208; week++){
    //calculate random percent multiplier for prediction
    double randomPercent = ((double)(Math.random()*0.4))+0.8;
    //calculate prediction
    double Prediction = Avg * randomPercent;
    //Iterate total expenditure for each 7-day week
    TotalExpenditure = TotalExpenditure+(7*Prediction);
}
//Average in dollars and cents
int AvgDollars = (int)Avg;
int AvgCents = ((int)(Avg*100)) % 100;
//Total expenditure in dollars and cents
int TEdollars = (int) TotalExpenditure;
int TEcents = ((int)(TotalExpenditure*100)) % 100;
//print average expenditure for the week
System.out.println("\nYour average daily expenditure for the week was: $"+AvgDollars+"."+AvgCents);
//print predicted expenditure
System.out.println("Your total predicted expenditure for the next 4 years is: $"+TEdollars+"."+TEcents);
System.out.println("_________________________________________________");

    }
}