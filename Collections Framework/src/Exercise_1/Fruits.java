/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_1;

/**
 *
 * @author hy
 */
import java.util.*;

public class Fruits {

    public static void main(String args[]) {
        ArrayList<String> listofFruits = new ArrayList<String>();
        listofFruits.add("Strawberry");
        listofFruits.add("Jackfruit");
        listofFruits.add("Apple");
        listofFruits.add("Banana");
        listofFruits.add("Orange");
        listofFruits.add("Watermelon");
        Collections.sort(listofFruits);
        for (String counter : listofFruits) {
            System.out.println(counter);
        }
    }
}
