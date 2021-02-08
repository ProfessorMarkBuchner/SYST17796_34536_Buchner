package ice1;
import java.util.Scanner;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nooranazpatel
 */
public class CardGame{
    private static boolean result;

    /**
     * @param args the command line arguments
     * @param value
     */
    public static void main(String[] args, int value)
    {
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++){
            Card c= new Card();
            int random=((int)(Math.random()*13)+1);
            c.setvalue(random); //c.setValue(method to generate random value from 1 to 13);
            int randomSuit=(int)(Math.random()*3);
           c.setSuits(Card.SUITS[randomSuit]); //  c.setSuits(method random suits);
            magicHand[i]=c;//saving object in array  
        }
            
        Scanner sc= new Scanner (System.in);
        System.out.println("pick any card");
         value=sc.nextInt();
         System.out.println("Pick any Suit");
         String suit= sc.next();
        Card winningcard = new Card();
        winningcard.setValue(4);
        winningcard.setSuits("Diamonds");
        boolean result=true;
        for (Card magicHand1 : magicHand) {
            
            if (magicHand1.getValue() == winningcard.getValue() && magicHand1.equals(winningcard.getSuits())) result=false; {
                result=true;
                break;
            }
          
        }
        if (result){
            System.out.println("Yay you've won");
        }else {
            System.out.println("Try again");
        }
        
        
      
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
       }
    
        
        
        
        
          
        
       
      
        
                
                
                
                
        
           
           //object
           
           
         //  c.setValue(method to generate random value from 1 to 13);
         //  c.setSuits(method random suits);
           //saving object in array
        
        
        
                
                
                
                
                //take input from user and compare with array
                // value=
                //     suit =

    private static class Card {

        private static String[] SUITS;

        public Card() {
        }

        private void setvalue(int random) {
           
        }

        private void setValue(int i) {
            
        }

        private void setSuits(String diamonds) {
          
        }

        private boolean getValue() {
            return false;
      

       
        }

        private Object getSuits() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    
    
    
}
