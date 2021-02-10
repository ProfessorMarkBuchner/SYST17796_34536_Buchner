package AbdullahJaved_Taji_ICE1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 * @author dancye
 * modified by Abdullah Javed Taji on 2/3/2021
 * student id 991612766
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();


            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[(rand.nextInt(4))]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Clubs");

        boolean result = false;

        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
                if (result == true) {
            System.out.println("Congrats. You win!!");
        } else {
            System.out.println("You lose!!");
        }
    }
}
