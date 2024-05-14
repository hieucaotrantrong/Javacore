package Exemple3;

import Buoi13.main;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(10, 10, 2004);
        Ngay ngay2 = new Ngay(10, 10, 2004);
        Ngay ngay3 = new Ngay(18, 10, 2024);

        Lop lop1 = new Lop("IT22H", "Khoa Cong Nghe Thong Tin");
        Lop lop2 = new Lop("D5H6", "Khoa Kinh Te");
        Lop lop3 = new Lop("ITSA22H", "Khoa Khoa Hoc May Tinh");

        SinhVien sinhvien1 = new SinhVien("98861", "Cao Tran Trong Hieu", ngay1, 9.0, lop1);
        SinhVien sinhvien2 = new SinhVien("98862", "Dinh Thi Phuong", ngay3, 9.0, lop3);
        SinhVien sinhvien3 = new SinhVien("98863", "Nguyen Trong Nghia", ngay2, 4.5, lop2);

        System.out.println("-----Ten Khoa----");
        System.out.println("Sinh vien 1 : " + sinhvien1.layTenKhoa());
        System.out.println("Sinh vien 2 : " + sinhvien2.layTenKhoa());
        System.out.println("Sinh vien 3 : " + sinhvien3.layTenKhoa());

        System.out.println("-----Diem Trung binh Co Thi Dat Hay Khong----");
        System.out.println("Diem Trung Binh Sinh Vien  1 : " + sinhvien1.kiemTraThiDat());
        System.out.println("Diem Trung Binh Sinh Vien  2  : " + sinhvien2.kiemTraThiDat());
        System.out.println("Diem Trung Binh Sinh Vien  3  : " + sinhvien3.kiemTraThiDat());

        System.out.println("---- Kiem Tra cung Ngay Sinh ----");
        System.out.println("Sinh vien 1 va Sinh Vien 2 : " + sinhvien1.kiemTraCungNgaySInh(sinhvien2));
        System.out.println("Sinh Vien 1 va sinh Vien 3 : " + sinhvien1.kiemTraCungNgaySInh(sinhvien3));
    }
}
