/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random randomNum = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c1 = new Card();
            c1.setValue(randomNum.nextInt(13) + 1); // 1 to 13
            c1.setSuit(Card.SUITS[randomNum.nextInt(4)]);
            magicHand[i]=c1;
        }
        
        //insert code to ask the user for Card value and suit, create their card
            Scanner scanner = new Scanner(System.in);
            System.out.println("choose a card 1 from 13: ");
            int UVal = scanner.nextInt();
            scanner.nextLine();  // i really wish we didnt need this unlike in python you can just put in 1 value and it moves on
            System.out.println("Pick a card suit (0-Hearts, 1-Diamonds, 2-Spades, -3Clubs: Pick a single number ok doki");
            String userSuit = scanner.nextLine();
            
            
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) 
        {
        int CVal = magicHand[i].getValue(); // Get the card value
        String cardSuit = magicHand[i].getSuit(); // Get the card suit

    // Compare value and suit separately, then proceed
        boolean isValueMatch = (CVal == UVal);
        boolean isSuitMatch = cardSuit.equalsIgnoreCase(userSuit);

    // If both the value and the suit match, then it's a match
    //Then report the result here
        if (isValueMatch && isSuitMatch) 
        {
            System.out.println("Your card is in the magic hand!"); 
            return;
        }
        else
        {
            System.out.println("Your card is NOT in the magic hand.");
            return;
        }
        }

        // add one luckcard hard code 2,clubs
    }    
}
