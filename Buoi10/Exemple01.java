package Buoi10;

import java.util.Scanner;

public class Exemple01 {
    /*
     * Viết chương trình nhập vào một mảng số nguyên có n phần tử và thực hiện các
     * công việc sau:
     * 
     * 1.Xuất giá trị các phần tử của mảng.
     * 2.Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
     * 3.Đếm số phần tử là số chẵn.
     * 4.Sắp xếp mảng tăng dần.
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        // xuất các giá trị của mảng
        do {
            System.out.println("Nhap vao so phan tu cua mang :");
            n = sc.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        System.out.println("Nhap vao phan tu cua mang :");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " :");
            A[i] = sc.nextInt();
        }
        // Xuất các giá trị các phần tử của mảng
        System.out.println(("\nMang ban dau :"));
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + "\t");
        }
    }
}
