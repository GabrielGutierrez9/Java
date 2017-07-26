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

public class PlayerOnePanel extends JPanel {
    //Buttons
    private final JButton p1Button;
    private final JButton p1Difficulty;
    private final JRadioButton p1ColorButton1;
    private final JRadioButton p1ColorButton2;
    private final JRadioButton p1ColorButton3;
    
    //Button groups
    private final ButtonGroup bg1;
    private final ButtonGroup bg2;
    
    public PlayerOnePanel()
    {
        // Create a GridLayout manager with
        // 5 rows and one column.
        setLayout(new GridLayout(5,1));
        
        //Create buttons.
        p1Button = new JButton("Human");
        p1Difficulty = new JButton("CPU");
        p1ColorButton1 = new JRadioButton("Red Stone");
        p1ColorButton2 = new JRadioButton("Green Stone");
        p1ColorButton3 = new JRadioButton("Blue Stone");
        
        //Group buttons
        bg1 = new ButtonGroup();
        bg1.add(p1Button);
        bg1.add(p1Difficulty);
             
        bg2 = new ButtonGroup();
        bg2.add(p1ColorButton1);
        bg2.add(p1ColorButton2);
        bg2.add(p1ColorButton3);
        
        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("1st Player"));
        
        // Add the radio buttons to this panel.
        add(p1Button);
        add(p1Difficulty);
        add(p1ColorButton1);
        add(p1ColorButton2);
        add(p1ColorButton3);
    }
    
    public String getFirstPlayer()
    {
        // The following variable will hold the cost
        // of the selected bagel.
        String player = "Human";

        // Determine which bagel is selected.
        if (p1Button.isSelected())
            player = "Human";
        else if(p1Difficulty.isSelected())
            player = "Computer";

        // Return the cost of the selected bagel.
        return player;
    }
    
    public int getFirstPlayerColor()
    {
        // The following variable will hold the color
        // of the first player stone.
        int color;

        // Determine which bagel is selected.
        if (p1ColorButton1.isSelected())
            color = 1;
        else if (p1ColorButton2.isSelected())
            color = 2;
        else
            color = 3;

        // Return the cost of the selected bagel.
        return color;
    }
}
