package Buoi3;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // nhập dữ liệu từ bàn phím
        System.out.println("Nhap vao ho va ten:");
        String hoVaTen = scanner.nextLine();
        System.out.println("Nhap ma sinh vien:");
        int maSinhVien = scanner.nextInt();
        System.out.println("Nhap vao diem thi:");
        float diemThi = scanner.nextFloat();
        // in ra màn hình
        System.out.println("------------------");
        System.out.println("Ho va ten:" + hoVaTen);
        System.out.println("Ma sinh vien:" + maSinhVien);
        System.out.println("Diem thi" + diemThi);

    }

}
