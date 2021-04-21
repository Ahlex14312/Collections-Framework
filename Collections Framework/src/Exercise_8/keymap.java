/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_8;

/**
 *
 * @author hy
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class keymap {

    public static void main(String[] a) {
        Map<String, String> arrayanimals = new HashMap<String, String>();
        arrayanimals.put("Animal9", "Carabao");
        arrayanimals.put("Animal2", "Pig");
        arrayanimals.put("Animal3", "Cow");
        arrayanimals.put("Animal4", "Monkey");
        arrayanimals.put("Insects4", "Spider");
        arrayanimals.put("Animal0", "Goat");
        arrayanimals.put("Animal8", "Dog");
        arrayanimals.put("Fly", "Mosquito");
        Set<String> set = arrayanimals.keySet()
                .stream()
                .filter(s -> s.startsWith("Animal"))
                .collect(Collectors.toSet());
        int count = 0;

        count = count + set.size();
        System.out.println("Value = " + count);
    }
}
