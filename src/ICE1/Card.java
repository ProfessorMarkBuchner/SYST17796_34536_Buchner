/*
 * Mehrab Zamanudin
 * Student ID:
 * SYST10199 - Web Programming
 */
package ICE1;
import java.util.Random;

/**
 *
 * @author zaman
 */
public class Card {
    private String suit;
    private int value;

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public static String[] getSUITS() {
        return SUITS;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", value=" + value + '}';
    }
}


