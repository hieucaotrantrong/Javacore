package Buoi23;

public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(98861, "Cao Tran Trong Hieu", "IT22H", 9);
        SinhVien sinhVien2 = new SinhVien(98862, "Cao Tran Tuan Hung", "IT23H", 7);
        SinhVien sinhVien3 = new SinhVien(98863, "Dinh Thi Phuong", "IT21H", 8);
        System.out.println(sinhVien1.compareTo(sinhVien2));
        System.out.println(sinhVien2.compareTo(sinhVien3));
    }
}
