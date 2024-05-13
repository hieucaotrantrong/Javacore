package Exemple2;

import Buoi13.main;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(10, 10, 2023);
        Ngay ngay2 = new Ngay(18, 6, 2023);
        Ngay ngay3 = new Ngay(11, 10, 2023);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Hieu Phuong", "Viet Nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Apple", "My");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Lenovo", "Han Quoc");

        BoPhim boPhim1 = new BoPhim("Mai", 2024, hangSanXuat1, 65000, ngay1);
        BoPhim boPhim2 = new BoPhim("Lat Mat 7", 2024, hangSanXuat2, 10000, ngay2);
        BoPhim boPhim3 = new BoPhim("Lat mat 6", 2024, hangSanXuat3, 50000, ngay3);
        System.out.println("So sanh Gia 1 re hon 2 :" + boPhim1.kiemTraGiaVeReHon(boPhim2));

        System.out.println("Ten Hang San Xuat Bo phim 1 :" + boPhim1.layTenHangSanXuat());

        System.out.println("Bo phim 1 giam 10% : " + boPhim1.giaSauKhuyenMai(10));
        System.out.println("Bo phim 2 giam 20% : " + boPhim2.giaSauKhuyenMai(20));
        System.out.println("Bo phim 3 giam 50% : " + boPhim3.giaSauKhuyenMai(50));
    }
}
