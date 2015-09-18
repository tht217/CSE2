////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/18/2015
//CSE 002
//lab04
//
//This program will:
//Generate a random card

//Random number between 1 and 52


//define a class
public class CardGenerator{
//adding a method
    public static void main(String[] args) {
//random suit generator
int randomNumber1 = (int)((Math.random()*4)+1);

//initializing suit string
String suit = "suit";

//if statements decide the suit string's value
if (randomNumber1 == 1){ //for diamonds
    suit = "Diamonds";
}
if (randomNumber1 == 2){ //for clubs
    suit = "Clubs";
}
if (randomNumber1 == 3){ //for hearts
    suit = "Hearts";
}
if (randomNumber1 == 4){ //for spades
    suit = "Spades";
}

//random card number
int randomNumber2 = (int)((Math.random()*13)+1);

//initialize card number string

//give number values
if (randomNumber2 > 1 && randomNumber2 <11){
    int cardV = randomNumber2;
    //print the random card as a number
    System.out.print("You picked the "+cardV+" of ");
    System.out.print(suit);
    System.out.println(".");
}
//give jack, queen, king and ace values.
else{
            String cardValue = "cardValue";
    if (randomNumber2 == 1){//define ace
        cardValue = "Ace";
    }
    if (randomNumber2 == 11){//define jack
        cardValue = "Jack";
    }
    if (randomNumber2 == 12){
        cardValue = "Queen";
    }
    if (randomNumber2 == 13){
        cardValue = "King";
    }

//print the random card as a string
System.out.print("You picked the ");
System.out.print(cardValue);
System.out.print(" of ");
System.out.print(suit);
System.out.println(" .");
    
} 

    }
}