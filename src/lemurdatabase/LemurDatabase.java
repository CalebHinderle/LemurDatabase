/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;
import javax.swing.JOptionPane;

/**
 *
 * @author cahin7692
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numOfLemurs = Integer.parseInt(JOptionPane.showInputDialog("How many lemurs would you like to add?"));
        Lemur lemurs[] = new Lemur[numOfLemurs];
        
        for(int i=0; i<numOfLemurs; i++){
            int lemurType = Integer.parseInt(JOptionPane.showInputDialog("What lemur would you like to add?\n1. Desert Lemur\n2. Jungle Lemur\n 3. Tree Lemur"));
        
        if(lemurType == 1){
            System.out.println("Desert Lemur");
            lemurs[i] = new DesertLemur();
        }
        else if(lemurType == 2){
            System.out.println("Jungle Lemur");
            lemurs[i] = new JungleLemur();
        }
        else if(lemurType == 3){
            System.out.println("Tree Lemur");
            lemurs[i] = new TreeLemur();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter a valid number! (1,2, or 3)");
            i=i-1;
        }
        }
            System.out.println("Displaying the list of Lemurs:\n--------------------------------------------\n");

        for(int j = 0; j < numOfLemurs; j++){
            System.out.println(lemurs[j].toString());
        }
        }
    
}
