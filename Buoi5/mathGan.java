package Buoi5;

import java.util.Scanner;

//   cách gán dữ liệu trong java
public class mathGan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Nhap vao so a bang");
        // cac phep gan
        a = sc.nextFloat();
        System.out.println("a=:" + a);
        a += 3;// a=a+3
        System.out.println("a+=3:" + a);
        a -= 2;// a=a-2
        System.out.println("a-=2:" + a);
        a *= 3;// a=a*3
        System.out.println("a*=3:" + a);

    }

}
