
package javaapplication3;

import java.util.Scanner;

/**
 *
 * modifier Het 
 */
public class CardTrick {
    
    public static void main(String[] args)
           
    {
        int value;
       
       Card[] magicHand = new Card[7];
      
      for (int i = 0; i< magicHand.length; i++) {
        Card s = new Card();
        int random = ((int)(Math.random()*13 +1);
        s.setValue(random);
        int randomSuit=(int) (Math.random()*3);
        s.setSuit (Card.SUITS[randomSuit]);
        magicHand[i] = s;
      }
      Scanner s = new Scanner (System.in);
      System.out.println("card");
      value = next();
      System.out.println("Suit");
      String suit = s.next();
      Card Win= new Card ();
      Win.setValue (4);
      Win.setSuit ("Hearts");
      boolean result = true;
      
      for (Card magic : magicHand)
      {
          if (magic.getValue() == Win.getValue() & magic.equals(Win.getSuit()))result = false;
          {
              result = true;
              break;
          }
      
    }
}
