package Exemple5;

import java.util.HashSet;
import java.util.Set;

/*
 * Dùng HashSet để lữu trữ đối tượng trong Interger
 */
public class Exemple_HashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        for (int i = 0; i < 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " " + "So duoc tim thay.");
            } else {
                System.out.println(i + " " + "So khong duoc tim thay");
            }
        }
    }
}
