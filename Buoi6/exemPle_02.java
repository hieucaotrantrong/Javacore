package Buoi6;

import java.util.Scanner;

public class exemPle_02 {
    public static void main(String[] args) {
        // giai phuong trinh bac 2 ax^2+bx+c=0
        // cac bien can co: a,b,c,x1,x2,delta
        /*
         * Neu a==0 thi bao loi
         * B2 Kiem tra delta
         * 2.1 delta<0=> Phuong trinh vo nghiem
         * 2.2 delta==0=> Phuong trinh co nghiem kep x1=x2=-b/2a
         * 2.3 delta>0=> Phuong trinh co 2 nghiem phan biet
         * x1=(-b-sqrt(delta)/(2a))
         * x2=(-b+sqrt(delta))/(2a)
         */
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a=");
        a = sc.nextDouble();
        System.out.println("Nhap vao b:");
        b = sc.nextDouble();
        System.out.println("Nhap vao c:");
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            System.out.println("Nhap du lieu sai");
        } else {
            if (delta < 0) {
                // tinh huong delta<0
                System.out.println("Phuong trinh vo nghiem!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem keo x1=x2=" + x1);
            } else {
                // Tinh huong delta>0
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong Trinh co nghiem");
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);

            }
        }
    }
}
