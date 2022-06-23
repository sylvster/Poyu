package com.poyu.gui;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        setup();
    }

    public static void setup() {
        //JFrame properties setup
        frame = new JFrame("Poyu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen = frame.getContentPane();

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
    private static Container screen;
    private static Color backgroundColor;

    private static boolean darkMode = false;

}
