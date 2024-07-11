package Exemple30;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Viet Nam", "Ha Noi");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Usa", "Washington Dc");
        capitalCities.put("Nhat Ban", "Tokyo");
        /*
         * Lấy ra một c
         * for (String i : capitalCities.keySet()) {
         * System.out.println(i);
         * }
         */
        System.out.println(capitalCities);
    }
}
