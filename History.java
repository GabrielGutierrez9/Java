/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
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



public class History {
    
    static String sName;
    static String data;
    
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
    
    
    
}
