////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/4/2015
//CSE 002
//Cyclometer Java Program
//
//This program will:
//a: print the number of minutes for each trip
//b: print the number of counts for each trup
//c: print the distance of each trip in miles
//d: print the distance for the two trips combined

//defining a class
public class Cyclometer{
    
//adding a method
    public static void main(String[] args) {
 
int secsTrip1=480; //Time for trip 1 in seconds
int secsTrip2=3220; //Time for trip 2 in seconds
int countsTrip1=1561; //Number of wheel rotations, or 'counts' in trip 1
int countsTrip2=9037; //Number of wheel rotations, or 'counts' in trip 2

//constants for calculation:
double wheelDiameter=27.0, //the diameter of the wheel in inches
    PI=3.14159, //value of pi
    feetPerMile=5280, //conversion between feet and miles
    inchesPerFoot=12, //conversion between inches and feet
    secondsPerMinute=60; //conversion between seconds and minutes
double distanceTrip1, distanceTrip2, totalDistance; //the output of the code as doubles

//Printing input information in miles
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
" minutes and had "+countsTrip2+" counts.");

//Calculating and storing calues here
distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;//distance of trip 1 in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;//distance of trip 2 in miles
totalDistance=distanceTrip1+distanceTrip2;

//Printing distances in miles
System.out.println("Trip 1 was "+distanceTrip1+" miles.");
System.out.println("Trip 2 was "+distanceTrip2+" miles.");
System.out.println("The total distance was "+totalDistance+" miles.");
System.out.println("Great Job!"); //A friendly congratulations

    } //end of main method
} //end of class