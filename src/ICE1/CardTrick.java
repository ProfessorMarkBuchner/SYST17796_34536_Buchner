/*
 * Mehrab Zamanudin
 * Student ID:
 * SYST10199 - Web Programming
 */
package ICE1;

import java.util.Random;
import java.util.Scanner;

/**
 *Mehrab Zamanudin
 * 02-09-2021
 * 
 * @author zaman
 */
public class CardTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Random genNum = new Random();
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit("Hearts");
        

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            //(insert call to random number generator here)
            magicHand[i].setValue(genNum.nextInt(13) + 1);
            magicHand[i].setSuit(Card.getSUITS()[genNum.nextInt(4)]);
           // System.out.println(magicHand[i].toString());
        }
        System.out.println("Choose/Enter any suit: ");
        String suit = input.nextLine();
        System.out.println("Enter any card value ");
        int value = input.nextInt();

        boolean result = true;
        if (suit == luckyCard.getSuit() && value == luckyCard.getValue()) {
            result = true;
            System.out.println("You win!");

        } else {
            result = false;
            System.out.println("You Lost! Try again");
        }
    }
}
    
