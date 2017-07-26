/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Gabriel
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameBoard extends JFrame implements ActionListener {
    //panels
    private final PlayerOnePanel playerOne;
    private final PlayerTwoPanel playerTwo;
    private final BottomPanel history;
    //private JPanel buttonPanel;
    JPanel buttonPanel = new JPanel(new GridLayout(5, 5));
    
    //keep track of whose turn it is
    public int turnCount = 0;
    //which player player 1 is represented by a 0 in the array and player 2 is
    public int player;
    public int winner;
    //to change the color of buttons
    public int color;
    
    //array to store moves
    public int [][] board = { {3, 3, 3, 3, 3}, {3, 3, 3, 3, 3}, {3, 3, 3, 3, 3},{3, 3, 3, 3, 3}, {3, 3, 3, 3, 3}};
    
    //buttons for game board
    private final JButton [] jb = new JButton[25];
    
    public GameBoard()
    {
        // Display a title.
        super("Tic Tac Toe");

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a BorderLayout manager.
         setLayout(new BorderLayout());
        
        // Create the custom panels.
    
        playerOne = new PlayerOnePanel();
        //create the button panel
        playerTwo = new PlayerTwoPanel();
        history = new BottomPanel();
        
    // Add the components to the content pane.
        for(int i=0; i<25; i++)
        {   
            jb[i] = new JButton(); 
            jb[i].addActionListener(this);
            buttonPanel.add(jb[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);
        add(playerOne, BorderLayout.WEST);
        add(playerTwo, BorderLayout.EAST);
        add(history, BorderLayout.SOUTH);
        
        
        // Set the size of the window and display it.
        setSize(500, 500);
    
        //Display
        setVisible(true);
    }
  
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== "history")
        {
            JOptionPane.showMessageDialog(null, "History");
        }
        
        
        
        
        
        if (e.getSource()==jb[0])
        {   
            if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[0].setBackground(Color.red);
            else if(color == 2)
                jb[0].setBackground(Color.green);
            else if(color == 3)
                jb[0].setBackground(Color.blue);
                
                board[0][0] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
                if(winner != 1)
                {
                    winner = checkColumn(player);
                    if(winner != 1)
                        winner = checkDiagonal(player);
                }
            
                else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
                turnCount++;
        }
        if (e.getSource()==jb[1])
        {          
            if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[1].setBackground(Color.red);
            else if(color == 2)
                jb[1].setBackground(Color.green);
            else
                jb[1].setBackground(Color.blue);
                
                board[0][1] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
                if(winner != 1)
                {
                    winner = checkColumn(player);
                    if(winner != 1)
                        winner = checkDiagonal(player);
                }
            
               else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
                    turnCount++;  
        }
        if (e.getSource()==jb[2])
        {
           if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[2].setBackground(Color.red);
            else if(color == 2)
                jb[2].setBackground(Color.green);
            else
                jb[2].setBackground(Color.blue);
           
            board[0][2] = turnCount%2;
            player = turnCount%2;
            winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
        }
        if (e.getSource()==jb[3])
        {
            if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[3].setBackground(Color.red);
            else if(color == 2)
                jb[3].setBackground(Color.green);
            else
                jb[3].setBackground(Color.blue);
            
            board[0][3] = turnCount%2;
            player = turnCount%2;
            winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
        }
        if (e.getSource()==jb[4])
        {
           if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[4].setBackground(Color.red);
            else if(color == 2)
                jb[4].setBackground(Color.green);
            else
                jb[4].setBackground(Color.blue);
            
            board[0][4] = turnCount%2;
            player = turnCount%2;
            winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
        }
        if (e.getSource()==jb[5])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[5].setBackground(Color.red);
            else if(color == 2)
                jb[5].setBackground(Color.green);
            else
                jb[5].setBackground(Color.blue);
                
                board[1][0] = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[6])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[6].setBackground(Color.red);
            else if(color == 2)
                jb[6].setBackground(Color.green);
            else
                jb[6].setBackground(Color.blue);
            
                board[1][1] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[7])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[7].setBackground(Color.red);
            else if(color == 2)
                jb[7].setBackground(Color.green);
            else
                jb[7].setBackground(Color.blue);
                board[1][2] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[8])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[8].setBackground(Color.red);
            else if(color == 2)
                jb[8].setBackground(Color.green);
            else
                jb[8].setBackground(Color.blue);
            
                board[1][3] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[9])
            {
                if(turnCount%2 == 0)
                    color = playerOne.getFirstPlayerColor();
                else if(turnCount == 1)
                    color = playerTwo.getSecondPlayerColor();
            
                if(color == 1)
                    jb[9].setBackground(Color.red);
                else if(color == 2)
                    jb[9].setBackground(Color.green);
                else
                    jb[9].setBackground(Color.blue);
                
                board[1][4] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[10])
            {
                if(turnCount%2 == 0)
                    color = playerOne.getFirstPlayerColor();
                else if(turnCount == 1)
                    color = playerTwo.getSecondPlayerColor();
            
                if(color == 1)
                    jb[10].setBackground(Color.red);
                else if(color == 2)
                    jb[10].setBackground(Color.green);
                else
                    jb[10].setBackground(Color.blue);
            
                board[2][0] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
                if(winner != 1)
                {
                    winner = checkColumn(player);
                    if(winner != 1)
                        winner = checkDiagonal(player);
                }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[11])
            {
                if(turnCount%2 == 0)
                    color = playerOne.getFirstPlayerColor();
                else if(turnCount%2 == 1)
                    color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[11].setBackground(Color.red);
            else if(color == 2)
                jb[11].setBackground(Color.green);
            else
                jb[11].setBackground(Color.blue);
            
                board[2][1] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[12])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[12].setBackground(Color.red);
            else if(color == 2)
                jb[12].setBackground(Color.green);
            else
                jb[12].setBackground(Color.blue);
            
                board[2][2] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[13])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[13].setBackground(Color.red);
            else if(color == 2)
                jb[13].setBackground(Color.green);
            else
                jb[13].setBackground(Color.blue);
            
                board[2][3] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[14])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[14].setBackground(Color.red);
            else if(color == 2)
                jb[14].setBackground(Color.green);
            else
                jb[14].setBackground(Color.blue);
            
                board[2][4] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[15])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[15].setBackground(Color.red);
            else if(color == 2)
                jb[15].setBackground(Color.green);
            else
                jb[15].setBackground(Color.blue);
            
                board[3][0] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[16])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[16].setBackground(Color.red);
            else if(color == 2)
                jb[16].setBackground(Color.green);
            else
                jb[16].setBackground(Color.blue);
            
                board[3][1] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[17])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[17].setBackground(Color.red);
            else if(color == 2)
                jb[17].setBackground(Color.green);
            else
                jb[17].setBackground(Color.blue);
            
                board[3][2] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[18])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[18].setBackground(Color.red);
            else if(color == 2)
                jb[18].setBackground(Color.green);
            else
                jb[18].setBackground(Color.blue);
            
                board[3][3] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[19])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[19].setBackground(Color.red);
            else if(color == 2)
                jb[19].setBackground(Color.green);
            else
                jb[19].setBackground(Color.blue);
                board[3][4] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[20])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[20].setBackground(Color.red);
            else if(color == 2)
                jb[20].setBackground(Color.green);
            else
                jb[20].setBackground(Color.blue);
            
                board[4][0] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
                if(winner != 1)
                {
                    winner = checkColumn(player);
                    if(winner != 1)
                    winner = checkDiagonal(player);
                }
                else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
                turnCount++;  
            }
        if (e.getSource()==jb[21])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[21].setBackground(Color.red);
            else if(color == 2)
                jb[21].setBackground(Color.green);
            else
                jb[21].setBackground(Color.blue);
            
                board[4][1] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
            
        if (e.getSource()==jb[22])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[22].setBackground(Color.red);
            else if(color == 2)
                jb[22].setBackground(Color.green);
            else
                jb[22].setBackground(Color.blue);
                board[4][2] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
        if (e.getSource()==jb[23])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[23].setBackground(Color.red);
            else if(color == 2)
                jb[23].setBackground(Color.green);
            else
                jb[23].setBackground(Color.blue);
                board[4][3] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++; 
            }
        if (e.getSource()==jb[24])
            {
                if(turnCount%2 == 0)
                color = playerOne.getFirstPlayerColor();
            else 
                color = playerTwo.getSecondPlayerColor();
            
            if(color == 1)
                jb[24].setBackground(Color.red);
            else if(color == 2)
                jb[24].setBackground(Color.green);
            else
                jb[24].setBackground(Color.blue);
                board[4][4] = turnCount%2;
                player = turnCount%2;
                winner = checkWinner(player);
            if(winner != 1)
            {
                winner = checkColumn(player);
                if(winner != 1)
                    winner = checkDiagonal(player);
            }
            else if(winner == 1)
                {
                   if(turnCount%2 == 0)
                       JOptionPane.showMessageDialog(null, "Game Over First Player Wins");
                   else if(turnCount%2 == 1)
                       JOptionPane.showMessageDialog(null, "Game Over Second Player Wins");
                }
               
            turnCount++;  
            }
    }
    
    public int checkWinner(int p)
    {
        int playerTally = 0;
	//variable to find if there was a winner
	int result = 0;
	

	for (int rowPosition = 0; rowPosition <= 4; rowPosition++)
	{
		//check each square in that row
		for (int currentSquare = 0; currentSquare <= 4; currentSquare++)
		{
			//if current square is 1 then we add tally up to playerStone
			if (board[rowPosition][currentSquare] == p)
			{
				                           
				playerTally++;
                                
			}
			//if player matches 4 in a row display win and exit
			if (playerTally == 4)
			{
				result = 1;
				return result;
			}
		}
		//clear tally of playerStone when it gets to new row
		playerTally = 0;
		
	}
	//returns if there is or isn't a winner
	return result;
    }
    
    public int checkColumn(int p)
    {
        
	int playerTally = 0;
        int tempRow;
        int counter = 0;

	//variable to find if there was a winner
	int result = 0;
	
	for (int rowPosition = 0; rowPosition <= 4; rowPosition++)
	{
            //check each square in that row
            for (int currentSquare = 0; currentSquare <= 4; currentSquare++)
            {
                //if current square is 1 then we add tally up to playerStone
		if (board[rowPosition][currentSquare] == p)
		{		
                    playerTally++;
	
                    //use a temperary row variable to check the next rows for player's matching stone
                    tempRow = rowPosition;
                    //this loop goes to next row and checks the same column
                    while(counter <=4 && tempRow <= 3) 
                    {
                        
                        //go to next rows as long as the column is the same value
                        board[tempRow][currentSquare] = board[tempRow++][currentSquare];
                        if (board[tempRow][currentSquare] == p)
                        {		
                            playerTally++; 
			}
			//if the next column is not the same as playerStone value exit the while loop
			else 
                        {
                            counter = 4;
                            playerTally = 0;
                        }
                        //if player matches 4 in a row in a column display win and exit
			if (playerTally == 4)
                        {
                            result = 1;
                            return result;
                        }
                        counter++;
                    }
                    
                }
            }
            //reset the counter, tempRow value, and playerStone value
            counter = 0;
            tempRow = 0;
            playerTally = 0;
        }
	return result;
    }
    
    //check diagonals for a win
    int checkDiagonal(int p)
{
	int playerTally = 0;

	//variable to find if there was a winner
	int winner = 0;
	
	//***check digonals top left to bottom right-if four of a kind player wins***//
	while (playerTally != 4)
	{
		if (board[0][0] == player)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				winner = 1;
				return winner;
			}
		}
		if (board[1][1] == player)
		{
			//shows where it found a match
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				return winner;
			}
		}
		if (board[2][2] == player)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				winner = 1;
				return winner;
			}
		}
		if (board[3][3] == player)
		{
			//shows where it found a match
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				winner = 1;
				return winner;
			}
		}
		if (board[4][4] == player)
		{
			//shows where it found a match
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				winner = 1;
				return winner;
			}
		}
		//put playerTally equal to 4 to exit loop
		playerTally = 4;
	}
	//clear out playerTally to enter next loop
	playerTally = 0;
	
	//***check digonals top right to bottom left-if four of a kind player wins***//
	while (playerTally != 4)
	{
		if (board[0][4] == playerTally)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				
				winner = 1;
				return winner;
			}
		}
		if (board[1][3] == player)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				
				winner = 1;
				return winner;
			}
		}
		if (board[2][2] == player)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				winner = 1;
				return winner;
			}
		}
		if (board[3][1] == player)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				winner = 1;
				return winner;
			}
		}
		if (board[4][0] == player)
		{
			//shows where it found a match
			
			playerTally = playerTally+1;
			if (playerTally == 4)
			{
				
				winner = 1;
				return winner;
			}
		}
		//put playerTally equal to 4 to exit loop
		playerTally = 4;
	}
	return winner;
}
}
