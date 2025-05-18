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
    private final int rockNumber = 0;
    private final int paperNumber = 1;
    private final int scissorsNumber = 2;
    private final int lizardNumber = 3;
    private final int spockNumber = 4;
    private int yourChoice;
    private int opponentChoice;
    private JLabel opponentChoiceLabel;
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

    private void youWin(){
        yourScore++;
        yourScoreField.setText(Integer.toString(yourScore));
    }

    private void opponentWins(){
        opponentScore++;
        opponentScoreField.setText(Integer.toString(opponentScore));
    }

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
            opponentChoiceLabel = new JLabel("");
            opponentChoiceLabel.setBounds(225, 320, 300, 30);
            opponentChoiceLabel.setFont(new Font("Arial", Font.PLAIN, 20));
            frame.add(opponentChoiceLabel);

            rockButton = new JButton("Rock");
            rockButton.setBounds(295, 150, 80, 80);
            rockButton.setHorizontalAlignment(JButton.CENTER);
            frame.add(rockButton);

            paperButton = new JButton("Paper");
            paperButton.setBounds(75, 300, 80, 80);
            paperButton.setHorizontalAlignment(JButton.CENTER);
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

            runGame();
        }

        public void runGame(){

            rockButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent x){
                    yourChoice = rockNumber;
                    calculateScore();
                }
            });

            paperButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent x){
                    yourChoice = paperNumber;
                    calculateScore();
                }
            });

            scissorsButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent x){
                    yourChoice = scissorsNumber;
                    calculateScore();
                }
            });

            lizardButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent x){
                    yourChoice = lizardNumber;
                    calculateScore();
                }
            });

            spockButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent x){
                    yourChoice = spockNumber;
                    calculateScore();
                }
            });

        }

        public void calculateScore(){

            Random random = new Random();
            opponentChoice = random.nextInt(5);

            switch (opponentChoice){

                case rockNumber:
                    opponentChoiceLabel.setText("Opponent Choice: Rock");
                    break;
                case paperNumber:
                    opponentChoiceLabel.setText("Opponent Choice: Paper");
                    break;
                case scissorsNumber:
                    opponentChoiceLabel.setText("Opponent Choice: Scissors");
                    break;
                case lizardNumber:
                    opponentChoiceLabel.setText("Opponent Choice: Lizard");
                    break;
                case spockNumber:
                    opponentChoiceLabel.setText("Opponent Choice: Spock");
                    break;
            }

            switch (yourChoice){

                case rockNumber:
                    switch (opponentChoice){
                        case rockNumber:
                            directionField.setText("Tie!");
                            break;
                        case paperNumber:
                            directionField.setText("Paper covers rock! Opponent wins!");
                            opponentWins();
                            break;
                        case scissorsNumber:
                            directionField.setText("Rock crushes scissors! You win!");
                            youWin();
                            break;
                        case lizardNumber:
                            directionField.setText("Rock crushes lizard! You win!");
                            youWin();
                            break;
                        case spockNumber:
                            directionField.setText("Spock vaporizes rock! Opponent wins!");
                            opponentWins();
                            break;
                    }
                    break;
                
                case paperNumber:
                    switch (opponentChoice){
                        case rockNumber:
                            directionField.setText("Paper covers rock! You win!");
                            youWin();
                            break;
                        case paperNumber:
                            directionField.setText("Tie!");
                            break;
                        case scissorsNumber:
                            directionField.setText("Scissors cuts paper! Opponent wins!");
                            opponentWins();
                            break;
                        case lizardNumber:
                            directionField.setText("Lizard eats paper! Opponent wins!");
                            opponentWins();
                            break;
                        case spockNumber:
                            directionField.setText("Paper disproves Spock! You win!");
                            youWin();
                            break;
                    }
                    break;

                case scissorsNumber:
                    switch (opponentChoice){
                        case rockNumber:
                            directionField.setText("Rock crushes scissors! Opponent wins!");
                            opponentWins();
                            break;
                        case paperNumber:
                            directionField.setText("Scissors cuts paper! You win!");
                            youWin();
                            break;
                        case scissorsNumber:
                            directionField.setText("Tie!");
                            break;
                        case lizardNumber:
                            directionField.setText("Scissors decapitates lizard! You win!");
                            youWin();
                            break;
                        case spockNumber:
                            directionField.setText("Spock smashes scissors! Opponent wins!");
                            opponentWins();
                            break;
                    }
                    break;
                
                case lizardNumber:
                    switch (opponentChoice){
                        case rockNumber:
                            directionField.setText("Rock crushes lizard! Opponent wins!");
                            opponentWins();
                            break;
                        case paperNumber:
                            directionField.setText("Lizard eats paper! You win!");
                            youWin();
                            break;
                        case scissorsNumber:
                            directionField.setText("Scissors decapitates lizard! Opponent wins!");
                            opponentWins();
                            break;
                        case lizardNumber:
                            directionField.setText("Tie!");
                            break;
                        case spockNumber:
                            directionField.setText("Lizard poisons Spock! You win!");
                            youWin();
                            break;
                    }
                    break;

                case spockNumber:
                    switch (opponentChoice){
                        case rockNumber:
                            directionField.setText("Spock vaporizes rock! You win!");
                            youWin();
                            break;
                        case paperNumber:
                            directionField.setText("Paper disproves Spock! Opponent wins!");
                            opponentWins();
                            break;
                        case scissorsNumber:
                            directionField.setText("Spock smashes scissors! You win!");
                            youWin();
                            break;
                        case lizardNumber:
                            directionField.setText("Lizard poisons Spock! Opponent wins!");
                            opponentWins();
                            break;
                        case spockNumber:
                            directionField.setText("Tie!");
                            break;
                    }
                    break;
            }
        }
}


public class RockPaperScissors{
    public static void main(String[] args){
        new RockPaperScissorsLizardSpock_GameStart();
    }
}