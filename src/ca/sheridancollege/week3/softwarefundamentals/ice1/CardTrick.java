/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c; 
        }
        //insert code to ask the user for Card value and suit, create their card
        Scanner k = new Scanner(System.in);
        System.out.print("Please enter your card value:");
        int cardValue = k.nextInt();
        System.out.print("Please enter your suit:");
        String suit = k.next();
        // and search magicHand here
        boolean doesItMatch = false;
        for(int i = 0; i<magicHand.length; i++)
        {
            if(magicHand[i].getValue() == cardValue)
            {
                if(magicHand[i].getSuit().equals(suit))
                    doesItMatch = true;
            }                
        }
        //Then report the result here
        
        if(doesItMatch == true)
            System.out.println("We've got a match");
        else
            System.out.println("Sorry no Match");
    }
    
}
