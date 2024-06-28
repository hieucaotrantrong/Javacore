package TestCase11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<GiaoDich> danhSachGiaoDich = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        /*
         * Nhập danh sách giao dịch
         */
        System.out.print("Nhap so luong giao dich: ");
        int soLuongGiaoDich = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < soLuongGiaoDich; i++) {
            System.out.println("Nhap thong tin giao dich thu : " + (i + 1) + " : ");
            System.out.println("Loai diao dich(dat/nha): ");
            String loaiGiaoDich = scanner.nextLine();
            System.out.print("Ma giao dich : ");
            String maGiaoDich = scanner.nextLine();
            System.out.println("Ngay giao dich(dd-MM-yyyy): ");
            String ngayGiaoDich = scanner.nextLine();
            System.out.println("Don Gia :");
            double donGia = scanner.nextDouble();
            System.out.println("Dien tich: ");
            double dienTich = scanner.nextDouble();
            scanner.nextLine();
            if (condition) {
                /*
                 * CHờ xử lí
                 */
            }
        }
    }
}
