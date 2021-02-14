/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package himil_patel_ice1;

import java.util.Scanner;

/**
 *
 * @author himil
 */
public class CardTrick {
    public static void main(String[] args)

    {
        int value;

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card s = new Card();
            int random = ((int) (Math.random() * 13) + 1);
            s.setValue(random);
            int randomSuit = (int) (Math.random() * 3);
            s.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = s;
        }
        Scanner s = new Scanner(System.in);
        System.out.println(" PICK A CARD");
        value = s.nextInt();
        System.out.println("PICK A SUIT");
        String suit = s.next();
        Card Win = new Card();
        Win.setValue(4);
        Win.setSuit("CLUB");
        boolean result = true;

        if (suit == Win.getSuit() && value == Win.getValue()) {
            result = true;
            System.out.println("YOU WIN");

        } else {
            result = false;
            System.out.println("DO IT AGAIN");
        }
    }

}