package TestCase2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien1 = new SinhVien(98861, "Cao Tran Trong Hieu", 9, 10);
        SinhVien sinhVien2 = new SinhVien(98866, "Cao Tran Tuan Hung", 7, 8);
        SinhVien sinhVien3 = new SinhVien(0, null, 0, 0);
        System.out.println("Nhap thong tin sinh vien :");
        System.out.println("Nhap ma sinh vien :");
        sinhVien3.setMaSV(scanner.nextInt());
        scanner.nextLine();// đọc bỏ dòng mới
        System.out.println("Nhap ho va ten:");
        sinhVien3.setHoVaTen(scanner.nextLine());
        System.out.println("Nhap diem LT:");
        sinhVien3.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap diem Th:");
        sinhVien3.setDiemTH(scanner.nextFloat());
        /*
         * In danh sách sinh viên
         */
        System.out.println("Danh sach sinh vien :");
        System.out.println(sinhVien1.toString());
        System.out.println(sinhVien2.toString());
        System.out.println(sinhVien3.toString());
        /*
         * Tính điểm sinh viên có qua môn hay không
         */
        System.out.println("Sinh vien 1 co qua mon khong : " + sinhVien1.tinhDiemQuaMon());
        System.out.println("Sinh vien 2 co qua mon khong : " + sinhVien2.tinhDiemQuaMon());
        System.out.println("Sinh vien 2 co qua mon khong : " + sinhVien3.tinhDiemQuaMon());
    }
}
