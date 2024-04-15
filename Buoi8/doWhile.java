package Buoi8;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao n>0:");
            n = sc.nextInt();
        } while (n <= 0);
    }
}
