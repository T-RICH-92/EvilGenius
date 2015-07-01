package com.richstudios.evilgenius.section1.project1;

import javax.swing.*;

/**
 * Created by T RICH on 6/30/2015.
 */
public class GuessPassword {
    public static void main(String[] args) {
        try {
            while (true) {
                String secretWord = JOptionPane.showInputDialog("Player 1: Enter the secret word.");
                while (secretWord.isEmpty()) {
                    secretWord = JOptionPane.showInputDialog("Player 1: Please enter at least 1 character.");
                }
                String guess = JOptionPane.showInputDialog("Player 2: Guess the secret word.");
                while (!guess.equalsIgnoreCase(secretWord)) {
                    while (guess.isEmpty()) {
                        guess = JOptionPane.showInputDialog("Player 2: Please enter a guess.");
                    }
                    if (guess.equalsIgnoreCase(secretWord)) break;
                    guess = JOptionPane.showInputDialog("Incorrect guess. Guess again.");
                }
                JOptionPane.showMessageDialog(null, "You got it! The secret word was " + secretWord);
            }
        } catch (NullPointerException e) {
            System.out.println("Player quit. Exiting.");
        }
    }
}
