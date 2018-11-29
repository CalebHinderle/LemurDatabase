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
public class Mammal {
    private int age;
    private double weight;
    private String gender;
    
    public Mammal(){
        age = (int)(Math.random() * 12 + 1);
        weight = (Math.random() * 5 + 1);
        int num = (int)(Math.random() * 2 + 1);
        if(num == 1){
            gender = "Male";
        }
        else {
            gender = "Female";
        }
    }
        public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String g) {
        gender = g;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public String toString() {
        String output = "Age = " + age + "\nWeight = " + weight + "\nGender = " + gender + "\n";
        return output;
    }

}
