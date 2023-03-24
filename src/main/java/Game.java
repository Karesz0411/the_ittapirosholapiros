import java.util.*;
/**
 *
 */


public class Game {
    public static void initialize(){
        System.out.println("Adj meg egy számot 1-3ig");
        Scanner userInput = new Scanner(System.in);
        String number = userInput.nextLine();               //TODO how to make a program to ask me for a string?
        System.out.println("A számod: " + number);
    }
}
