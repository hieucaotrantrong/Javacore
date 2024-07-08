package Exemple5;

import java.util.LinkedList;

public class Exemple_LinkList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.offer("Volco");
        cars.offer("Bmw");
        cars.offer("Ford");
        cars.offer("Maxda");
        System.out.println(cars);
    }
}
