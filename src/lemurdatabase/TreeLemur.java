/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author cahin7692
 */
public class TreeLemur extends Lemur{
    String food = "Fruit";
    String colour = "Red";
    String packSize = "Large groups";

    public String toString() {
        String output = "Tree Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n*********************\n";
        return output;
    }

}
