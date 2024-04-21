package Buoi10;

//  Cách bắt lỗi ngoại lệ try catch trong lập trình java
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Nhap vao so nguyen n");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap du lieu khong dung");
        } finally {
            System.out.println("finally");
        }

        System.out.println("Gia tri nhap la" + n);
        System.out.println("Ket thuc chuong trinh");
    }
}
