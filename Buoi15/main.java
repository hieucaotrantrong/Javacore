package Buoi15;

import Buoi13.MyDate;

public class main {
    public static void main(String[] args) {
        myDate Mydate = new myDate(10, 10, 2023);
        myDate Mydate1 = new myDate(10, 10, 2023);
        myDate Mydate2 = new myDate(11, 2, 2023);
        System.out.println(Mydate);
        System.out.println(Mydate1);
        System.out.println(Mydate2);
        System.out.println("Mydate so sanh bang Mydate1 = " + Mydate.equals(Mydate1));
        System.out.println("Mydate so sanh bang mydate2 = " + Mydate.equals(Mydate2));
        System.out.println("Hashcode Mydate =" + Mydate.hashCode());
        System.out.println("Hashcode Mydate1 =" + Mydate.hashCode());
        System.out.println("Hashcode Mydate2 = " + Mydate.hashCode());
    }
}
