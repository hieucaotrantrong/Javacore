package Exemple30;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        /*
         * Thêm 1 cặp key và value
         */
        people.put("Hieu", 18);
        people.put("Phuong", 18);
        people.put("Hung", 17);
        for (String i : people.keySet()) {
            System.out.println("Key" + i + "Value" + people.get(i));
        }
    }
}
