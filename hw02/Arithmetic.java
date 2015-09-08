////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/8/2015
//CSE 002
//HW02: Arithmetic Calculations
//
//This program will:
//
//defining a class
public class Arithmetic{
//adding a method
    public static void main(String[] args) {
 
//INPUT VARIABLES
int nSocks=3;//Number of pairs of socks
double sockCost$=2.58;  //Cost per pair of socks

int nGlasses=6; //Number of drinking glasses
double glassCost$=2.29; //Cost per glass

int nEnvelopes=1;//Number of boxes of envelopes
double envelopeCost$=3.25; //cost per box of envelopes

double taxPercent=0.06; //Tax percent

//VARIABLES TO BE CALCULATED
double sockPreTax; //cost of socks before tax
double sockTax; //tax due to socks
double sockTotal; //sock cost including tax
double glassPreTax; //cost of glasses before tax
double glassTax; //tax due to glasses
double glassTotal; //glasses cost including tax
double envelopePreTax; //cost of envelopes before tax
double envelopeTax; //tax due to envelopes
double envelopeTotal; //total cost of envelopes
double salesTax; //total taxes due to purchases
double totalPreTax; //total cost before taxes
double totalCheckout; //total due including tax

//CALCULATIONS
sockPreTax=(nSocks*sockCost$); //Cost of socks before tax
sockTax=(taxPercent*sockPreTax); //The tax due to socks bought
sockTotal=(sockTax+sockPreTax); //Total cost of socks including tax
 //Operation to make output have two decimals
sockTotal=100*sockTotal;
sockTotal = (int)sockTotal;  //This step gets rid of extra decimal values via implicit cast
sockTotal=((double)sockTotal)/100;
 //Operation to give tax output two decimals
sockTax=100*sockTax;
sockTax = (int)sockTax; //This step gets rid of extra decimal values via implicit cast
sockTax=((double)sockTax)/100; //explicit cast

glassPreTax=(nGlasses*glassCost$); //Cost of glasses before tax
glassTax=(taxPercent*glassPreTax); //Tax due to glasses bought
glassTotal=(glassTax+glassPreTax); //Total cost of glasses including tax
 //Operation to make output have two decimals
glassTotal=100*glassTotal;
glassTotal = (int)glassTotal;  //This step gets rid of extra decimal values
glassTotal=((double)glassTotal)/100; //explicit cast
 //Operation to give tax output two decimals
glassTax=100*glassTax;
glassTax = (int)glassTax; //This step gets rid of extra decimal values via implicit cast
glassTax=((double)glassTax)/100; //explicit cast

envelopePreTax=(nEnvelopes*envelopeCost$); //Cost of envelopes before tax
envelopeTax=(taxPercent*envelopePreTax); //Tax due to envelopes bought
envelopeTotal=(envelopeTax+envelopePreTax); //Total cost of envelopes
 //Operation to make output have two decimals
envelopeTotal = 100*envelopeTotal;
envelopeTotal = (int)envelopeTotal;  //This step gets rid of extra decimal values
envelopeTotal=((double)envelopeTotal)/100; //explicit cast
 //Operation to give tax output two decimals
envelopeTax=100*envelopeTax;
envelopeTax = (int)envelopeTax; //This step gets rid of extra decimal values via implicit cast
envelopeTax=((double)envelopeTax)/100; //explicit cast

salesTax=sockTax+glassTax+envelopeTax; //Total sales tax
totalPreTax=sockPreTax+glassPreTax+envelopePreTax; //Total cost before tax
//Operation to give output 2 decimal places
totalPreTax=100*totalPreTax;
totalPreTax=(int)totalPreTax; //This step gets rid of extra decimal values
totalPreTax=((double)totalPreTax)/100;
totalCheckout=sockTotal+glassTotal+envelopeTotal; //Total amount due

//Printing cost of each before tax
    //Socks
 System.out.println("Before tax, the cost of socks is $"+sockPreTax+"");
 System.out.println("Tax due to socks is $"+sockTax+"");
    //Glasses
 System.out.println("Before tax, the cost of glasses is $"+glassPreTax+"");
 System.out.println("Tax due to glasses is $"+glassTax+"");
    //Envelopes
 System.out.println("Before tax, the cost of envelopes is $"+envelopePreTax+"");
 System.out.println("Tax due to envelopes is $"+envelopeTax+"");
//Print total cost before tax
 System.out.println("The total cost of this purchase before tax is $"+totalPreTax+"");
//Print total due
 System.out.println("The total cost of this purchase including tax is $"+totalCheckout+"");
 
    }
}