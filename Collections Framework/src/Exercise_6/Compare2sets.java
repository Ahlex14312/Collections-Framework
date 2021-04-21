/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_6;

/**
 *
 * @author hy
 */
import java.util.*;

public class Compare2sets {

    public static void main(String[] argv) {
        Set<String> arrayset1 = new HashSet<String>();
        arrayset1.add("Orange");
        arrayset1.add("Strawberry");
        arrayset1.add("Jackfruit");
        arrayset1.add("Apple");
        arrayset1.add("Mango");
        arrayset1.add("Banana");
        arrayset1.add("Lemon");
        System.out.println("Set 1: " + arrayset1);

        Set<String> arrayset2 = new HashSet<String>();
        arrayset2.add("Orange");
        arrayset2.add("Banana");
        arrayset2.add("Lemon");
        arrayset2.add("Strawberry");
        arrayset2.add("Eggplant");
        arrayset2.add("Jackfruit");
        arrayset2.add("Cabbage");
        System.out.println("Set 2: " + arrayset2);

        arrayset2.retainAll(arrayset1);
        System.out.println("Common Values: " + arrayset2);
    }
}
