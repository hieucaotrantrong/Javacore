package TestCase1;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int n = 100;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so nguyen <100 : ");
            n = scanner.nextInt();
            if (n > 100) {
                System.out.println("Nhap so nho hon 100 : ");
            }
        } while (n <= 0 || n >= 100);
        System.out.println("cac so chan tu 0 den " + n + "la");
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
