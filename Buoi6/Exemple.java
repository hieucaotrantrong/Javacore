package Buoi6;

import java.util.Scanner;

public class Exemple {
    // giai phuong trinh bac nhat
    // ax+b=0
    // neu a=0
    // neu b=0=> pt vo so nghiem
    // neu b!0=pt vo nghiem
    // neua!=0
    // co nghiem x=-b/a
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a=");
        a = sc.nextDouble();
        System.out.println("Nhap b=");
        b = sc.nextDouble();
        if (a == 0) {
            // tinh huong a=0
            if (b == 0) {
                // tinh huong a=0 b=0
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                // tinh huong a b! 0
                System.out.println("Phuong trinh vo nghiem:");
            }
        } else {
            // tinh huong a!=0
            x = -b / a;
            System.out.println("Co nghiem:" + x);
        }
    }
}
