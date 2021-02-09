/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * <br>
 *
 * Edited by Bumsoo Park {student number: 991628986}
 * <br>
 * Date: Feb 7th, 2021.
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
        
        for (int i=0; i<magicHand.length; i++) {
            
            Card c = new Card();
            
            int randomNumber = rnd.nextInt((13 - 1) + 1) +1;
            
            c.setValue(randomNumber);
            
            String rString = Card.SUITS[rnd.nextInt(Card.SUITS.length)];
            
            c.setSuit(rString);
            
        }
        
       //insert code to ask the user for Card value and suit, create their card
       //lucky card
        Card luckyCard = new Card ();
        luckyCard.setValue(4);
        luckyCard.setSuit("Hearts");

        Scanner scanner = new Scanner(System.in);

        Card userCard = new Card();

        System.out.println("Other than a joker, enter the suit of the card you picked: ");
        userCard.setSuit(Scanner.nextLine());

        System.out.println("Enter the number of the card you picked: ");
        userCard.setValue(Scanner.nextInt());

        // and search magicHand here
        //Then report the result here
        System.out.println("Value " + luckyCard.getValue());
        System.out.println("Suit: " + luckyCard.getSuit());
        
    }
    
}
