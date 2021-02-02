
import java.util.Scanner;

/*
 * Xavier Chelleri
 * Student ID: 991623643
 * SYST10199 - Web Programming 
 */

/**
 *
 * @author xdcb
 */
public class WordReverse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the word");
        
        String word = input.nextLine();
        
        char[] wordArray = new char[word.length()];
        
        for(int i = 0; i < word.length(); i++){
            wordArray[i] = word.charAt(i);
        }
        System.out.println("Now we'll print in reverse");
        
        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(wordArray[i]);
        }
    }
}
