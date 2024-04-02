package Buoi5;

import java.util.Scanner;

public class classMath {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap vao so a:");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b:");
        b = sc.nextDouble();
        System.out.println("----------------");
        // hàm tính giá trị tuyệt đối
        System.out.println("|a|=" + Math.abs(a));
        // hàm tìm min
        System.out.println("min(a,b)=" + Math.min(a, b));
        // hàm tìm max
        System.out.println("max(a,b)=" + Math.max(a, b));
        // hàm ceil lấy một số nguyên lớn hơn
        System.out.println("ceil(a)" + Math.ceil(a));
        // lấy một số nguyên nhỏ hơn
        System.out.println("floor(a)=" + Math.floor(a));
        // hàm tính căn bậc 2
        System.out.println("sqrt(a)=" + Math.sqrt(a));
        // hàm tính a*b
        System.out.println("a^b=" + Math.pow(a, b));

    }

}
