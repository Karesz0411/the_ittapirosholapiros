package com.the.ittapirosholapiros;

import javax.swing.*;
import java.awt.*;
    /**
    * Create the class, and the function
    */
public class GUI{
    public void display() {
        int position_x = 200;
        int position_y = 50;
        int width = 1080;
        int height = 720;
        
        /**
         * Create the GUI frame
         */
        JFrame gui_frame = new JFrame();
        gui_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui_frame.setBounds(position_x, position_y, width, height);
        gui_frame.setLayout(null);
        gui_frame.setVisible(true);
        
        /**
         * Create the panel
         */
        JPanel gui_panel = new JPanel();
        gui_panel.setBackground(Color.CYAN);
        gui_panel.setBounds(0, 0, width, height);
        gui_panel.setLayout(null);
        gui_panel.setVisible(true);
        gui_frame.add(gui_panel);
        
        /**
         * Let's add some label to the panel
         */
        JLabel game_title_label = new JLabel("Pick a card, any card");
        game_title_label.setLocation(430,0);
        game_title_label.setSize(150,30);
        game_title_label.setHorizontalAlignment(0);
        game_title_label.setForeground(Color.RED);
        gui_panel.add(game_title_label);
        /**
         ***********************************************************************
         */
        JLabel want_to_play_game = new JLabel("Do you want to play?");
        want_to_play_game.setLocation(440,200);
        want_to_play_game.setSize(150,30);
        want_to_play_game.setHorizontalAlignment(0);
        want_to_play_game.setForeground(Color.DARK_GRAY);
        gui_panel.add(want_to_play_game);
    }
}
