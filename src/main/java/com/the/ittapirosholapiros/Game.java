package com.the.ittapirosholapiros;
import java.util.*;

public class Game {
    public void initialize(){
        Random random = new Random();
        int red = random.nextInt(1,4);
        System.out.println("Adj meg egy számot 1-3ig");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt(); 
        System.out.println("A számod: " + number);
        if (red == number) {
            System.out.println("You've won!");
        }
        else {
            System.out.println("You've lost. The right nuber was: " + red);
        }
    }
}
