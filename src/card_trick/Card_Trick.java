/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_trick;

import java.util.Scanner;

/**
 *
 * @author manmohitsingh
 */
public class Card_Trick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int rand = (int)(Math.random()*13)+1;
            c.setValue(rand);
            int ran = (int)(Math.random()*3);
            c.setSuit(Card.SUITS[ran]);
            magicHand[i] = c;
        }
        
        Scanner s = new Scanner(System.in);
        System.out.println("Pick any Card");
        int value = s.nextInt();
        System.out.println("Pick any Suit");
        String su = s.next();
        Card a = new Card();
        a.setValue(4);
        a.setSuit("Diamonds");
        boolean r = true;

        for (Card magicHanCard : magicHand) {
            if (magicHanCard.getValue() == a.getValue() && magicHanCard.equals(a.getSuit())) {
                r = true;
                break;
            }
        }

        if (r) {
            System.out.println("You win");
        }
        else {
            System.out.println("You lose. Better luck next time!");
        }
    }
}
