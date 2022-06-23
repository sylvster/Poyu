package com.poyu.gui;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        setup();
    }

    public static void setup() {
        //JFrame properties setup
        frame = new JFrame("Poyu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel properties setup
        screen = new JPanel();

        //Layout setup
        layout = new GroupLayout(screen);
        screen.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        JButton amongus = new JButton("Add schedule");
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(amongus)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addComponent(amongus)
        );

        //Adding the JPanel to the frame
        frame.add(screen, BorderLayout.CENTER);

        //setting the background color of the app
        if(darkMode) {
            backgroundColor = Color.BLACK;
        } else {
            backgroundColor = Color.WHITE;
        }
        backgroundColor = Color.WHITE;
        screen.setBackground(backgroundColor);

        //Sets the default size of the frame as full screen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //visualizes the screen
        frame.setVisible(true);
    }

    private static JFrame frame;
    private static JPanel screen;
    private static Color backgroundColor;

    private static GroupLayout layout;

    private static boolean darkMode = false;

}
