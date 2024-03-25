package Buoi5;

import java.util.Scanner;

public class classMath {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b:");
        b = sc.nextDouble();

        // hàm tính giá trị tuyệt đối
        System.out.println("|a|" + Math.abs(a));
    }

}
