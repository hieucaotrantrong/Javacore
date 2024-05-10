package Exemple;

import Buoi13.main;

public class Myname {
    private int id;
    private String name;

    // contructor
    public Myname(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myname [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        Myname hieu = new Myname(1, "Hieu");
        System.out.println("Information :" + hieu);
    }
}
