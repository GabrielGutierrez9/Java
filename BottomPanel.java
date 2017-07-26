package javaapplication15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class BottomPanel extends JPanel implements ActionListener{
    
    static String sName;
    static String data;
    
    //Buttons for quit and history
    private final JButton history;
    private final JButton quit;
    
    /**
    * Constructor
    */
    public BottomPanel()
    {
        // Create a GridLayout manager with
        // four rows and one column.
        setLayout(new GridLayout(1, 2));
        
        // Create the radio buttons.
        history = new JButton("History");
        quit = new JButton("Quit");
        
        // Add the radio buttons to this panel.
        add(history);
        history.addActionListener(this);
        add(quit);
        quit.addActionListener(this);
    }
    
     public static String searchName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name to search");
        sName = in.nextLine();
        return sName;
    }
    
    public static void readFile(){
         
     try{
         // History.txt needs to be at the root of the folder
         // if not, savedata method will create it 
        FileReader fr = new FileReader("History.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
          if (line.contains(sName)) {
            System.out.println(line); 
          }
        }
        br.close();
        
      }
      catch (IOException e) {
        System.out.println("File Not Found");
      }
  }
    
    public static void saveData(){
        //data = player1.name + " " + player2.name + " " + date + " " + result;
        BufferedWriter bw = null;
        FileWriter fw = null;
        DateFormat df = new SimpleDateFormat("MM/dd/yy");
        Date dateobj = new Date();
        
        //testing data
        data = System.lineSeparator() + "Travis Leon " + df.format(dateobj)  +" Win";
        try{
            File file = new File("History.txt");
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            
            bw.write(data);
            System.out.println("Saving Records");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(bw != null)
                    bw.close();
                if(fw != null)
                    fw.close();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== quit)
        {
            System.exit(0);
        }
        if (e.getSource()== history)
        {
            History.sName = JOptionPane.showInputDialog(null, "Enter username to search");
            History.readFile();
        }
    }
    
    
}
    


