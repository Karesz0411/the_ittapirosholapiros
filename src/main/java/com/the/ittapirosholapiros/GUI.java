package com.the.ittapirosholapiros;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI{
    public void display() {
        int position_x = 100;
        int position_y = 200;
        int width = 350;
        int height = 200;
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
        gui_frame.add(gui_panel);
        gui_panel.setBackground(Color.CYAN);
        gui_panel.setBounds(position_x, position_y, width, height);
        
    }
}
