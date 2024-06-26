package Buoi25;

public class Main {
    public static void main(String[] args) {
        ThoiKhoaBieu thoiKhoaBieu = new ThoiKhoaBieu(Day.Monday, "Toan,Ly,Hoa");
        ThoiKhoaBieu thoiKhoaBieu2 = new ThoiKhoaBieu(Day.Tuesday, "Toan, Su,Dia");
        ThoiKhoaBieu thoiKhoaBieu3 = new ThoiKhoaBieu(Day.Saturday, "Ly, Su,Dia");
        ThoiKhoaBieu thoiKhoaBieu4 = new ThoiKhoaBieu(Day.Wednesday, "Tin Hoc,GDCD,The duc");
        System.out.println(thoiKhoaBieu);
    }

}
