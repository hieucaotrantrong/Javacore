package Buoi11;

public class Mydate {
    private int day;
    private int month;
    private int year;

    // cách xây dựng lpows và phương thức khởi tạo
    // A constructor
    public Mydate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printDay() {
        System.out.println("Day :" + this.day);
    }

    public void printMonth() {
        System.out.println("Month :" + this.month);
    }

    public void printYear() {
        System.out.println("Year :" + this.year);
    }

    public void printDate() {
        System.out.println("Date :" + this.day + "-" + this.month + "-" + this.year);
    }
}
