package Buoi5;

import java.util.Scanner;

public class Exemple {
    // bài toán tính chu vi diện tích hình tròn
    public static void main(String[] args) {
        double r, chuVi, dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r:");
        r = sc.nextDouble();
        // tính chu vi hình tròn
        chuVi = 2 * Math.PI * r;
        System.out.println("Chu vi hinh tron bang:" + Math.round(chuVi));
        // tinh dien tich hinh tron
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Dien tich hinh tron la:" + Math.round(dienTich));
    }

}
