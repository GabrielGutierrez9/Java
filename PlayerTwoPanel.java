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

public class PlayerTwoPanel extends JPanel {
    //Buttons
    private final JButton p2Button;
    private final JButton p2Difficulty;
    private final JRadioButton p2ColorButton1;
    private final JRadioButton p2ColorButton2;
    private final JRadioButton p2ColorButton3;
    
    //Button groups
    private ButtonGroup bg1;
    private ButtonGroup bg2;
    
    
    
    
    
    public PlayerTwoPanel()
    {
        // Create a GridLayout manager with
        // 5 rows and one column.
        setLayout(new GridLayout(5,1));
        
        //Create buttons.
        p2Button = new JButton("Human");
        p2Difficulty = new JButton("CPU");
        p2ColorButton1 = new JRadioButton("Red Stone");
        p2ColorButton2 = new JRadioButton("Green Stone");
        p2ColorButton3 = new JRadioButton("Blue Stone");
        
        //Group buttons
        bg1 = new ButtonGroup();
        bg1.add(p2Button);
        bg1.add(p2Difficulty);
             
        bg2 = new ButtonGroup();
        bg2.add(p2ColorButton1);
        bg2.add(p2ColorButton2);
        bg2.add(p2ColorButton3);
        
        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("2nd Player"));
        
        // Add the radio buttons to this panel.
        add(p2Button);
        add(p2Difficulty);
        add(p2ColorButton1);
        add(p2ColorButton2);
        add(p2ColorButton3);
      
    }
    
    public String getSecondPlayer()
    {
        // The following variable will hold the cost
        // of the selected bagel.
        String player = "Human";

        // Determine which bagel is selected.
        if (p2Button.isSelected())
            player = "Human";
        else if(p2Difficulty.isSelected())
            player = "Computer";

        // Return the cost of the selected bagel.
        return player;
    }
    
    public int getSecondPlayerColor()
    {
        // The following variable will hold the cost
        // color of the stone
        int color;

        // Determine which color stone is selected.
        if (p2ColorButton1.isSelected())
            color = 1;
        else if (p2ColorButton2.isSelected())
            color = 2;
        else
            color = 3;

        // Return the cost of the selected bagel.
        return color;
    }
}
