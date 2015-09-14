////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/15/2015
//CSE 002
//hw03 Program 1
//
//This program will:
//Tell the user how long until dinner
//
//import the scanner class
import java.util.Scanner;

//define a class
public class Timer{
//adding a method
    public static void main(String[] args) {

//Scanner
Scanner myScanner = new Scanner( System.in );

//prompt user for time
System.out.print("What time is it in the form HHMM? ");
//find hours and minutes
double nowTime = myScanner.nextDouble();
//hours
int nowHours = (int)(nowTime/100);
//minutes
double nowMinutes = nowTime-(nowHours*100);
//prompt user for dinner time

System.out.print("What time is dinner in the form HHMM? ");
//find hours and minutes
double dinnerTime = myScanner.nextDouble();
//hours
int dinnerHours = (int)(dinnerTime/100);
//minutes
double dinnerMinutes = dinnerTime-(dinnerHours*100);

//declare variables for difference in time
double differenceHours,differenceMinutes;

//calculate time left until dinner
//if dinner is after now
if ( dinnerTime>nowTime ){
    //if dinner minutes are after now minutes
    if ( dinnerMinutes>=nowMinutes ){
        //hours
        differenceHours = dinnerHours-nowHours;
        //minutes
        differenceMinutes = (dinnerTime-nowTime)-(differenceHours*100);
    }
    else{ //if dinner minutes are before now minutes
        //hours
        differenceHours = dinnerHours-nowHours-1;
        //minutes
        differenceMinutes = ((dinnerMinutes-nowMinutes));
        //correcting for negative minutes
        if ( differenceMinutes<0 ){
            //minutes
            differenceMinutes = 60 - (nowMinutes-dinnerMinutes);
        }
    }
    int printHour = (int)differenceHours;
    int printMinute = (int)differenceMinutes;
    //print time left
    System.out.println("There are "+printHour+" hour(s) and "+printMinute+
    " minute(s) until dinner.");
        
}
//if dinner time is past or right now
if ( nowTime>=dinnerTime ){
    System.out.println("You're late! dinner already started and may have ended.");
    
}
}
}