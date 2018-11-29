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
public class DesertLemur extends Lemur{
    String food = "Cacti";
    String colour = "White";
    double babyDeathRate = 0.66;
    String Kingdom = "Animalia";
    String Phylum = "Chordata";
    String Class = "Mammalia";
    String Order = "Primates";
    String Suborder = "Strepsirrhini";
    String Infraorder =	"Lemuriformes";
    String Superfamily = "Lemuroidea";

    public String toString() {
        String output = "Desert Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nBaby Death Rate = " + babyDeathRate + "Kingdom = " + Kingdom+ "Phylum= "+Phylum+ "\n*********************\n";
        return output;
    }
}
