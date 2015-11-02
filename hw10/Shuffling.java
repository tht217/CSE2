////////////////////////////////////////////////////////////////////////////////
//Thomas Troxell
//11/03/2015
//CSE 002
//hw10: Shuffling
//
//This program will shuffle a deck of cards and pick you a hand.


//Import scanner
import java.util.Scanner;
//define a class
public class Shuffling{
    public static void main(String[] args) {
        //Why is this here?
        Scanner scan = new Scanner(System.in);
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            //System.out.print(cards[i]+" ");
        }
        
        //call each array in this order to print out a similar output to the example.
        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
    //Printing class
    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){//loop for number of elements
            System.out.print(array[i]+" ");//print element with space
        }
        System.out.print("\n");//paragraph for organization
    }
    //shuffling class
    public static String[] shuffle(String[] cards){
        System.out.println("Shuffle");
        for(int i=0; i<156; i++){//do 156 swaps to shuffle the deck
            int j=((int)(Math.random()*52));//randomly pick a card
            //Use a placeholder to save one card and swap the other
            String placehold = cards[0];
            cards[0]=cards[j];
            cards[j]=placehold;
        }
        //return modified string that was entered
        return cards;
    }
    //hand picking class
    public static String[] randomizeHand(String[] cards){
        System.out.println("Randomized hand:");
        //initialize new string to be returned
        String[] Hand = new String[5];
        for(int i=0;i<5;i++){//loop for each card in the hand
            //random card
            Hand[i]=cards[(int)(Math.random()*52)];
            //check card to see if it matches any of the previous cards.
            for(int j=0;j<i;j++){
                if (!Hand[i].equals(Hand[j])){
                    continue;
                }
                else{ 
                    i-=1;
                    break;
                    //if the card matches, undo the pick
                }
            }
        }
        //returns the new string with random cards
        return Hand;
    }
}
