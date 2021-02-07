
import java.util.Random;
import java.util.Scanner;

/*
 * Xavier Chelleri
 * Student ID: 991623643
 * 
 */

/**
 *
 * @author xdcb
 */
public class CardTrick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random numGen = new Random();
        Card[] magicHand = new Card[7];

        boolean found = false;
        while (!found) {
            for (int i = 0; i < magicHand.length; i++) {
                magicHand[i] = new Card();

                //c.setValue(insert call to random number generator here)
                magicHand[i].setValue(numGen.nextInt(13) + 1);

                //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
                magicHand[i].setSuit(Card.getSUITS()[numGen.nextInt(4)]);

                //System.out.println(magicHand[i].toString());
            }

            //insert code to ask the user for Card value and suit, create their card
            System.out.print("Choose a suit: ");
            String suit = input.nextLine();
            System.out.print("Give me a card value: ");
            //int value = input.nextInt(); // It only reads numbers
            int value = Integer.valueOf(input.nextLine()); // Allow me to extract and parse the input
            System.out.println("Your card is a " + value + " of " + suit);

            // and search magicHand here
            //equalsIgnoreCase(suit) - will ignore caps and lowercase as long as characters match
            //Then report the result here
            for (int e = 0; e < magicHand.length; e++) {
                //System.out.println(magicHand[e].toString());
                if (magicHand[e].getSuit().equalsIgnoreCase(suit) && value == magicHand[e].getValue()) {
                    System.out.println("Your card value " + value
                            + " and " + suit + " matches!");
                    System.out.println("You won!");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Sorry you lost!");
            }
        }
    }
}
