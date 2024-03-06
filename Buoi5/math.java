package Buoi5;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        // khai báo biến
        int a, b;
        // nhập dữ liệu
        // các phép toán cơ bản trong java
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a=");
        a = sc.nextInt();
        System.out.println("Nhap vao so b:");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println("ket qua phep tinh tong la:" + tong);
        float thuong = (float) a / b;
        System.out.println("ket qua phep tinh thuong la:" + thuong);
        int nhan = a * b;
        System.out.println("ket qua phep tinh nhan la:" + nhan);
        int hieu = a - b;
        System.out.println("ket qua phep tinh hieu la:" + hieu);
        int sodu = a % b;
        System.out.println("ket qua phep tinh so su la:" + sodu);
    }

}