package com.the.ittapirosholapiros;

import java.util.*;


/**
 * This class initialize the game   
 */
public class Game {
    
    public void initialize() {

        Random random = new Random();
        /**
         * program choose a random number between 1 and 3
         */
        int red_card = random.nextInt(1,4);
        /**
         * User choose a number, and convert to integert
         */
        System.out.println("Enter a number between 1 and 3");
        Scanner userInput = new Scanner(System.in);
        int user_picked_number = userInput.nextInt(); 
        
        /**
         * If this variable is true, you can continue the game.
         * If false, you can't.
         */
        
        
        boolean is_game_valid;
        
        /**
         * Decide the variable to true or false.
         */
        switch (user_picked_number) {
            case 1:
                is_game_valid = true;
                break;
            case 2:
                is_game_valid = true;
                break;
            case 3:
                is_game_valid = true;
                break;
            default:
                is_game_valid = false;
        /**
         ***********************************************************************
         */
        }
        if (is_game_valid == true) {
            System.out.println("Your number: " + user_picked_number);
            System.out.println("The winning number: " + red_card);
            /**
            * Decide whether the user has won
            */
            if (red_card == user_picked_number) {
                System.out.println("You won!");
            }
            else {
                System.out.println("You lost");           
            }   
        }   
        else{
            System.out.println("The game is invalid. You have to choose number, between 1 and 3.");
        }
        /**
         * Let's decide to play again or exit
         */
        System.out.println("Type 0 for one more game!");
        System.out.println("Type anything else to stop the game!");
        Scanner continue_game = new Scanner(System.in); 
        int want_to_play_again = continue_game.nextInt(); 
        /**
         ***********************************************************************
         */
        if(want_to_play_again == 0){
            this.initialize();        
        }
        else{
        
        }
        

    }
}
