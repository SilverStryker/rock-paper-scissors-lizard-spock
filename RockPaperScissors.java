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
    private JTextField directionField;
    private JButton yesButton;
    private JButton noButton;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JButton lizardButton;
    private JButton spockButton;
    private JTextField yourScoreField;
    private JTextField opponentScoreField;
    private JLabel yourLabel;
    private JLabel opponentLabel;
    


    public RockPaperScissorsLizardSpock_GameStart(){

        frame = new JFrame("Rock, Paper, Scissors");
        frame.setSize(700, 700);
        frame.setLayout(null);

        directionField = new JTextField("Would you like to play a game of Rock, Paper, Scissors, Lizard, Spock?");
        directionField.setBounds(5, 5, 675, 100);
        directionField.setHorizontalAlignment(JTextField.CENTER);
        directionField.setFont(new Font("Arial", Font.PLAIN, 16));
        directionField.setEditable(false);
        frame.add(directionField);

        yesButton = new JButton("Yes");
        yesButton.setBounds(75, 300, 100, 100);
        yesButton.setFont(new Font("Arial", Font.PLAIN, 28));
        frame.add(yesButton);

        noButton = new JButton("No");
        noButton.setBounds(510, 300, 100, 100);
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

            directionField.setText("Let's Play! Make your choice!");

            rockButton = new JButton("Rock");
            rockButton.setBounds(295, 150, 80, 80);
            rockButton.setHorizontalAlignment(JButton.CENTER);
            frame.add(rockButton);

            paperButton = new JButton("Paper");
            paperButton.setBounds(75, 300, 80, 80);
            rockButton.setHorizontalAlignment(JButton.CENTER);
            frame.add(paperButton);
            
            scissorsButton = new JButton("Scissors");
            scissorsButton.setBounds(510, 300, 80, 80);
            scissorsButton.setHorizontalAlignment(JButton.CENTER);
            frame.add(scissorsButton);

            lizardButton = new JButton("Lizard");
            lizardButton.setBounds(200, 450, 80, 80);
            lizardButton.setHorizontalAlignment(JButton.CENTER);
            frame.add(lizardButton);

            spockButton = new JButton("Spock");
            spockButton.setBounds(385, 450, 80, 80);
            spockButton.setHorizontalAlignment(JButton.CENTER);
            frame.add(spockButton);

            yourScoreField = new JTextField("0");
            yourScoreField.setBounds(5, 555, 100, 100);
            yourScoreField.setHorizontalAlignment(JTextField.CENTER);
            yourScoreField.setFont(new Font("Arial", Font.PLAIN, 32));
            yourScoreField.setEditable(false);
            frame.add(yourScoreField);

            opponentScoreField = new JTextField("0");
            opponentScoreField.setBounds(580, 555, 100, 100);
            opponentScoreField.setHorizontalAlignment(JTextField.CENTER);
            opponentScoreField.setFont(new Font("Arial", Font.PLAIN, 32));
            opponentScoreField.setEditable(false);
            frame.add(opponentScoreField);

            yourLabel = new JLabel("You");
            yourLabel.setBounds(5, 525, 100, 25);
            yourLabel.setHorizontalAlignment(JLabel.CENTER);
            yourLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            frame.add(yourLabel);

            opponentLabel = new JLabel("Opponent");
            opponentLabel.setBounds(580, 525, 100, 25);
            opponentLabel.setHorizontalAlignment(JLabel.CENTER);
            opponentLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            frame.add(opponentLabel);


        }

    

    
}


public class RockPaperScissors{
    public static void main(String[] args){
        new RockPaperScissorsLizardSpock_GameStart();
    }
}