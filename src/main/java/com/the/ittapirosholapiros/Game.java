package com.the.ittapirosholapiros;
import java.util.*;

public class Game {
    public void game_class(){
        Random random = new Random();
        /*
            program choose a random number between 1 and 3
        */
        int red_card = random.nextInt(1,4);
        /*
            User choose a number, and convert to integert
        */
        System.out.println("Enter a number between 1 and 3");
        Scanner userInput = new Scanner(System.in);
        int user_picked_number = userInput.nextInt(); 
        
        System.out.println("Your number: " + user_picked_number);
        System.out.println("The winning number: " +red_card);
        /*
            Decide whether the user has won
        */
        if (red_card == user_picked_number) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost");
        }
    }
}
