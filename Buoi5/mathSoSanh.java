package Buoi5;

import java.util.Scanner;

public class mathSoSanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a:");
        a = sc.nextInt();
        System.out.println(" Nhap b:");
        b = sc.nextInt();
        // xuất kết quả so sánh
        System.out.println(a + "==" + b + ":" + (a == b));
        System.out.println(a + "!" + b + ":" + (a != b));
        System.out.println(a + "<" + b + ":" + (a < b));
        System.out.println(a + "<=" + b + ":" + (a <= b));
        System.out.println(a + ">" + b + ":" + (a > b));
        System.out.println("-----------");
        // so sánh điều kiên
        System.out.println(" Ca hai so la so chan:" + (a % 2 == 0 && b % 2 == 0));
        System.out.println(" Ca it nhat 1 so chan:" + (a % 2 == 0 || b % 2 == 0));
    }
}
