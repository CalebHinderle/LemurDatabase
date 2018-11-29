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
public class JungleLemur extends Lemur{
    String food = "Mice, Snails, and Insects";
    String colour = "Black or Blue";
    String packSize = "Small groups";

    public String toString() {
        String output = "Jungle Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n*********************\n";
        return output;
    }
}
