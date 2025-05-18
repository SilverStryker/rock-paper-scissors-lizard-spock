/*
 This is my first attempt at creating a project all on my own, 
 with my own brain. It won't be very good.
 Date: 5/17/25
 */

import java.util.Random;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

class RockPaperScissorsLizardSpock_GameStart{
    private final int rock = 0;
    private final int paper = 1;
    private final int scissors = 2;
    private final int lizard = 3;
    private final int spock = 4;
    private int yourScore = 0;
    private int opponentScore = 0;

    private JFrame frame;
    private JButton yesButton;
    private JButton noButton;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JButton lizardButton;
    private JButton spockButton;


    public RockPaperScissorsLizardSpock_GameStart(){

        frame = new JFrame("Rock, Paper, Scissors");
        frame.setSize(500, 500);
        frame.setLayout(null);

        JTextField directionField = new JTextField("Would you like to play a game of Rock, Paper, Scissors, Lizard, Spock?");
        directionField.setBounds(5, 5, 490, 100);
        directionField.setHorizontalAlignment(JTextField.CENTER);
        directionField.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(directionField);

        yesButton = new JButton("Yes");
        yesButton.setBounds(50, 300, 100, 100);
        yesButton.setFont(new Font("Arial", Font.PLAIN, 28));
        frame.add(yesButton);

        noButton = new JButton("No");
        noButton.setBounds(325, 300, 100, 100);
        noButton.setFont(new Font("Arial", Font.PLAIN, 28));
        frame.add(noButton);

        yesButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent x){
                createGame();
            }
        });

        noButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent x){
                System.exit(0);
            }
        });

        frame.setVisible(true);

    }
        public void createGame(){

            frame.remove(yesButton);
            frame.remove(noButton);
            frame.revalidate();
            frame.repaint();


        }

    

    
}


public class RockPaperScissors{
    public static void main(String[] args){
        new RockPaperScissorsLizardSpock_GameStart();
    }
}