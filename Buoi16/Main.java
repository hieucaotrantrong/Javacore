package Buoi16;

import Buoi13.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Kiem tra---");
        ConNguoi conNguoi = new ConNguoi("CaoHieu", 2003);
        conNguoi.an();
        conNguoi.ngu();
        conNguoi.uong();
        HocSinh hocSinh = new HocSinh("Dinh Phuong", 2004, "MK22H", "Dai hoc Ngan Hang");
        hocSinh.an();
        hocSinh.uong();
        hocSinh.ngu();
        hocSinh.lamBaiTap();

    }
}
