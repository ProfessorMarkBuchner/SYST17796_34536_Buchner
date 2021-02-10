
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
        Card c = new Card();
        int random = ((int)(Math.random()*13) +1);
        c.setValue(random);
        int randomSuit=(int) (Math.random()*3);
        c.setSuit (Card.SUITS[randomSuit]);
        magicHand[i] = c;
      }
      Scanner s = new Scanner (System.in);
      System.out.println("pick a card");
      value = s.nextInt();
      System.out.println("pick a Suit");
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
      if (result){
          System.out.println("you win");
      }
      else{
          System.out.println("Do again");
      }
    }
}