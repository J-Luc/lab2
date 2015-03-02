/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import javax.swing.JOptionPane;


/**
 *3/2/15
 * @author class
 */
public class CoinChanger {
    private static int Quater_Value;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int Quater_VALUE = 25;
        final int Dime_Value = 10;
        final int Nickel_Value = 5;
         
        // TODO let's ask the user for D.
        String input = JOptionPane.showInputDialog("enter the maount of cahnge;");
        
        int d = Integer.parseInt(input);
        System.out.println("the user entered: " + d);
        
         
     // TODO cmpute the amount of change
     //TODO calculate the numbers of quaters.
    
        int quaterCount = d / Quater_Value;
        
        //TODO calculate the numbers of dimes.
        int dimes;
        
        //TODO calculate the numbers of nickles.
        int nickels;
        
        //TODO calculate the numbers of pennies.
        int pennies;
        
        //TODO what's left in d is the amout of pennies.
        //TODO Print the number of coins in each category.
        //TODO: Print the total number of coins.
        
    }
    
}
