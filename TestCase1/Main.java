package TestCase1;

import java.util.Scanner;

/*
 *  chưa hoàn thành đợi xử lí 
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] danhSachXe = new Vehicle[3];
        int luaChon;
        do {
            System.out.println("Menu");
            System.out.println("1:Nhap thong tin va tao doi tuong");
            System.out.println("2: Xuat bang ke tien thue truoc ba cua cac loai xe");
            System.out.println("3: Thoat");
            System.out.println("Lua chon cua ban :");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    for (int i = 0; i < danhSachXe.length; i++) {
                        System.out.println("Nhap ten chu xe:" + (i + 1) + ":");
                        String tenChuXe = scanner.nextLine();
                        System.out.println("Nhap nhan hieu xe" + (i + 1) + ":");
                        String nhanHieu = scanner.nextLine();
                        System.out.println("Nhap gia tri xe " + (i + 1) + ":");
                        float giaTri = scanner.nextInt();
                        System.out.println("Nhap dung tich xy lanh xe " + (i + 1) + ":");
                        int dungTichXILanh = scanner.nextInt();
                        scanner.nextLine();
                        danhSachXe[i] = new Vehicle(nhanHieu, tenChuXe, giaTri, dungTichXILanh);
                    }
                    break;
                case 2:
                    System.out.printf("%-20s %-15s %-10s %15s %15s%n", "Ten Chu xe", "Loai xe", "Dung tich", "Tri Gia",
                            "Thue phai nop");
                    System.out.println("=".repeat(80));
                    for (Vehicle xe : danhSachXe) {
                        if (xe != null) {
                            xe.hienThiThongTinXe();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thoat chung trinh");
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (luaChon != 3);
        scanner.close();
    }
}
