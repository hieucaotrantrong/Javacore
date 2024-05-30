package Buoi13;

public class main {
    public static void main(String[] args) {
        MyDate md = new MyDate(10, 1, 2024);
        // Day
        System.out.println("Day =" + md.getDay());
        md.setDay(35);
        System.out.println("Day=" + md.getDay());
        md.setDay(18);
        System.out.println("Day=" + md.getDay());

        // ----
        System.out.println("-----------");
        // Month
        System.out.println("Month =" + md.getMonth());
        md.setMonth(13);
        System.out.println("Month=" + md.getMonth());
        md.setMonth(5);
        System.out.println("Month=" + md.getMonth());

    }

}
