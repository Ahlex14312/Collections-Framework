/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_3;

public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<java.lang.Integer> numbers = new java.util.ArrayList<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(23);
        numbers.add(91);
        numbers.add(6);
        numbers.add(1);
        int min = 1000;
        System.out.println("Before: ");
        System.out.println(numbers);

        for (int b : numbers) {
            if (b < min) {
                min = b;
            }
        }
        numbers.remove(numbers.indexOf((java.lang.Integer) min));
        numbers.add(0, min);

        System.out.println("After: ");
        System.out.println(numbers);

    }

}
