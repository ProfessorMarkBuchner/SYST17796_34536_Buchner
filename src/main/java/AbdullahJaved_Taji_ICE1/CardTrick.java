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

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[(rand.nextInt(4))]);
            magicHand[i] = c;
//            System.out.println(c.toString());
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

//         Card playerCard = new Card();

//         System.out.println("Enter any card value");
//         int playerCardVal = input.nextInt();

//         playerCard.setValue(playerCardVal);

//         System.out.println("Enter any card suite");
//         playerCard.setSuit(input.next());


//         boolean result = false;

//         for (int i = 0; i < magicHand.length; i++) {
//             if (playerCard.getValue() == magicHand[i].getValue() && playerCard.getSuit().equals(magicHand[i].getSuit())) {
//                 result = true;
//                 break;
//             } else {
//                 result = false;
//             }
//         }

//         if (result == true) {
//             System.out.println("Your card is present in the Magic Hand.");
//         } else {
//             System.out.println("Your card is not present in the Magic Hand.");
//         }
    }
}
