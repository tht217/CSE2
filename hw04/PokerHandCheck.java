////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//9/21/2015
//CSE 002
//hw04
//
//This program will:
//*Generate 5 random cards from 5 separate decks
//*State whether the hand contains a pair, two pair,
// three of a kind, or it is a high card hand.

//define a class
public class PokerHandCheck{
//adding a method
    public static void main(String[] args) {
        
//Set initial match array values and pair to zero
int match[] = { 0, 0, 0, 0, 0, 0 };
int pair = 0;
int ThreeKind = 0;
        
//initializing suit string
String suit[] = new String[6];
//initialize card number array
int cardV[] = { 0, 0, 0, 0, 0, 0 };
//initializing 
String cardValue[] = new String[6];
        
//PICK 5 RANDOM CARDS FROM 5 SEPARATE DECKS:
for (int i=1; i<6; i++){
//random suit generator
int randomNumber1 = (int)((Math.random()*4)+1);
;
//if statements decide the suit string's value
if (randomNumber1 == 1){ //for diamonds
    suit[i] = "Diamonds";
}
if (randomNumber1 == 2){ //for clubs
    suit[i] = "Clubs";
}
if (randomNumber1 == 3){ //for hearts
    suit[i] = "Hearts";
}
if (randomNumber1 == 4){ //for spades
    suit[i] = "Spades";
}
//random card number
int randomNumber2 = (int)((Math.random()*13)+1);
//save number
cardV[i] = randomNumber2;

//give number values
if (randomNumber2 > 1 && randomNumber2 <11){
    //print the random card as a number
    System.out.print("You picked the "+cardV[i]+" of ");
    System.out.print(suit[i]);
    System.out.println(".");
}
//give jack, queen, king and ace values.
else{
    
    if (randomNumber2 == 1){//define ace
        cardValue[i] = "Ace";
    }
    if (randomNumber2 == 11){//define jack
        cardValue[i] = "Jack";
    }
    if (randomNumber2 == 12){
        cardValue[i] = "Queen";
    }
    if (randomNumber2 == 13){
        cardValue[i] = "King";
    }

//print the random card as a string
System.out.print("You picked the ");
System.out.print(cardValue[i]);
System.out.print(" of ");
System.out.print(suit[i]);
System.out.println(" .");
   
} 
//loop up to i to check for pairs
for (int j=1; j<i; j++){
//check to see if card number is equal to a former card number
    if (cardV[i] == cardV[i-j]){
        match[i]=match[i]+1;
    }

}
}

for (int k=0; k<6; k++){
if (match[k] == 1){
    pair = pair+1;
}
if (match[k] == 2 || match[k] == 3){
    ThreeKind = 1;
}
}
//print the result
if (pair==0){//high card hand
    System.out.println("You have a high card hand!");
}
if (pair==1 && ThreeKind==0){ //drew a pair
    System.out.println("You drew a pair!");
}
if (pair==2 && ThreeKind==0){ //drew two pair
    System.out.println("You drew two pair!");
}
if (ThreeKind==1){ //drew three of a kind
    System.out.println("You drew three of a kind!");
}
if ((pair==2 || pair==3) && ThreeKind==1){ //drew a full house
    System.out.println("That's a full house!");
}

    }
}