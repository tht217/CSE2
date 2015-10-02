////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/11/2015
//CSE 002
//lab06: Getting Loopy
//
//This program will:
//Print numbers from 1 to 7, and then repeat the 7s.

//define a class
public class GettingLoopy{
//adding a method
    public static void main(String[] args) {
        
//STEP 1
////////////////////////////////////////////////////////////
//Numbers 1 to 7:
System.out.println("Numbers 1 to 7:");
//initialize num
int num = 0;
//loop to print numbers 1 to 7        
while (num<7){
    num=num+1;
    System.out.print(num);
}
//print 7 multiple times
for (int count=1; count<5; count++){
    System.out.print(7);
}

//STEP 2
////////////////////////////////////////////////////////////
//Using while loop
System.out.println("\nPrime numbers 10 - 100 using while loop:");
//Print only prime numbers from 10 - 100
int numb = 10;
while (numb < 101){
    //Check to see if number is prime
    boolean checkPrime=true;
        for (int i=2 ; i<numb ; i++){
            if(numb%i==0){
                checkPrime=false;
                break;
            }
            else{
                checkPrime=true;
            }
        }
    
    //Print on same line if number is prime
    if (checkPrime){
        System.out.print(numb+" ");
    }
    numb=numb+1;
}
//Using for loop
System.out.println("\nPrime numbers 10 - 100 using for loop:");
for (numb=10 ; numb<101 ; numb++){
    //Check to see if number is prime
    boolean checkPrime=true;
        for (int i=2 ; i<numb ; i++){
            if(numb%i==0){
                checkPrime=false;
                break;
            }
            else{
                checkPrime=true;
            }
        }
    //Print on same line if number is prime
    if (checkPrime){
        System.out.print(numb+" ");
    }
}
//Using do-while loop
System.out.println("\nPrime numbers 10 - 100 using do-while loop:");
numb = 10;
do{
    //Check to see if number is prime
    boolean checkPrime=true;
        for (int i=2 ; i<numb ; i++){
            if(numb%i==0){
                checkPrime=false;
                break;
            }
            else{
                checkPrime=true;
            }
        }
    
    //Print on same line if number is prime
    if (checkPrime){
        System.out.print(numb+" ");
    }
    numb=numb+1;
}while(numb<101);

//STEP 3
////////////////////////////////////////////////////////////
//print the following
System.out.println("\nPrint between 5 and 200 smiley faces:");
int max=(int)(Math.random()*196)+5;
//foor loop to print smileys
for(int incr =0 ; incr<max ; incr++){
    System.out.print(":)");
}

    }
}