package com.the.ittapirosholapiros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Create the gui of the game
 */
public class GUI_of_the_game extends JFrame {
    public int machine_choosed_number = 0;
    public int current_iteration = 0;
    
    /**
     * //TODO: write doc comment for function 
     */
    public void game_display() {
        Random random = new Random();
        /**
         * program choose a random number between 1 and 3
         */
        machine_choosed_number = random.nextInt(1,4);
        /**
         * Create the frame of the game
         */
        int position_x = 200;
        int position_y = 50;
        int width = 1080;
        int height = 720;
        JFrame game_gui_frame = new JFrame();
        game_gui_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game_gui_frame.setBounds(position_x, position_y, width, height);
        game_gui_frame.setLayout(null);
        
        /**
         * Create the panel of the game
         */
        JPanel game_gui_panel = new JPanel();
        game_gui_panel.setBackground(Color.CYAN);
        game_gui_panel.setBounds(0, 0, width, height);
        game_gui_panel.setLayout(null);
        game_gui_frame.add(game_gui_panel);
        /**
         * Game title
         */
        JLabel ingame_title_label = new JLabel("Pick a card, any card");
        ingame_title_label.setLocation(350,0);
        ingame_title_label.setSize(350,30);
        ingame_title_label.setHorizontalAlignment(0);
        ingame_title_label.setForeground(Color.RED);
        ingame_title_label.setFont(new Font("Verdana", Font.PLAIN,30));
        game_gui_panel.add(ingame_title_label);
        
        /**
         * Add an empty label
         */
        JLabel message_displayer = new JLabel("?");
        message_displayer.setLocation(350,100);
        message_displayer.setSize(350,30);
        message_displayer.setHorizontalAlignment(0);
        message_displayer.setForeground(Color.RED);
        message_displayer.setFont(new Font("Verdana", Font.PLAIN,30));
        game_gui_panel.add(message_displayer);
        
        try {
            /**
             * Let's create the pickable cards, as a buttons
             */
            for (current_iteration = 1; current_iteration < 4; current_iteration++) {
                int sub_current_iteration = current_iteration;
                BufferedImage card_back_image = ImageIO.read(new File("C:\\\\Users\\Admin\\Desktop\\Projects\\holapiros\\the_ittapirosholapiros\\src\\main\\java\\com\\the\\Card_pictures\\Card_back.png"));
                JButton card = new JButton (new ImageIcon(card_back_image));   
                card.setLocation(sub_current_iteration * 300 - 200, 200);
                card.setSize(200, 120);
                card.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {  
                    int player_choosed_number = sub_current_iteration; 
                    System.out.println(machine_choosed_number);
                    System.out.println(player_choosed_number);
                    System.out.println(sub_current_iteration);
                        if (player_choosed_number == machine_choosed_number) {
                            System.out.println("You won");
                            message_displayer.setText("You won");
                        }
                        else {
                            System.out.println("You lost");    
                            message_displayer.setText("You lost");
                        }   
                }
                
                });
                game_gui_panel.add(card);                
            }
        }    
        catch (IOException ex) {
            Logger.getLogger(GUI_of_the_game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        game_gui_panel.setVisible(true);
        game_gui_frame.setVisible(true);
    }

}
