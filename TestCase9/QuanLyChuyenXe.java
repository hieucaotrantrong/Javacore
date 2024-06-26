package TestCase9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChuyenXe {
    private ArrayList<ChuyenXeNoiThanh> danhSachNoiThanh = new ArrayList<>();
    private ArrayList<ChuyenXeNgoaiThanh> danhSachNgoaiThanh = new ArrayList<>();

    public void nhapChuyenXe(Scanner scanner) {
        System.out.println("Nhap loai chuyen xe(1.Chuyen xe noi thanh,2.Chuyen xe ngoai thanh)");
        int loai = scanner.nextInt();
        scanner.nextLine();
        if (loai == 1) {
            System.out.println("Ma so chuyen: ");
            String maSoChuyen = scanner.nextLine();
            System.out.println("Ho ten tai xe : ");
            String hoTenTaiXe = scanner.nextLine();
            System.out.println("So xe : ");
            String soXe = scanner.nextLine();
            System.out.println("So tuyen : ");
            int soTuyen = scanner.nextInt();
            System.out.println("So km di duoc : ");
            int soKmDiDuoc = scanner.nextInt();
            System.out.println("Doanh thu : ");
            double doanhThu = scanner.nextDouble();
            scanner.nextLine();
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh(maSoChuyen, hoTenTaiXe, soXe, doanhThu, soTuyen,
                    soKmDiDuoc);
            danhSachNoiThanh.add(chuyenXeNoiThanh);
        } else if (loai == 2) {
            System.out.println("Ma so chuyen :");
            String maSoChuyen = scanner.nextLine();
            System.out.println("Ho ten tai xe :");
            String hoTenTaiXe = scanner.nextLine();
            System.out.println("So xe :");
            String soXe = scanner.nextLine();
            System.out.println("Noi den :");
            String noiDen = scanner.nextLine();
            System.out.println("So ngay di duoc :");
            int soNgayDiDuoc = scanner.nextInt();
            System.out.println("Doanh Thu :");
            double doanhThu = scanner.nextDouble();
            scanner.nextLine();
        }
    }

    public void xuatDanhSachChuyenXe() {
        System.out.println("\nChuyen Xe noi Thanh:");
        for (ChuyenXeNoiThanh chuyenXeNoiThanh : danhSachNoiThanh) {
            chuyenXeNoiThanh.xuatThongTin();
        }
        System.out.println("\nDanh sach chuyen xe ngoai thanh :");
        for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : danhSachNgoaiThanh) {
            chuyenXeNgoaiThanh.xuatThongTin();
        }
    }

    public double tinhTongDoanhThuNoiThanh() {
        double tongDoanhThu = 0;
        for (ChuyenXeNoiThanh chuyenXeNoiThanh : danhSachNoiThanh) {
            tongDoanhThu += chuyenXeNoiThanh.getDoanhThu();
        }
        return tongDoanhThu;
    }

    public double tinhTongDoanhThuNgoaiThanh() {
        double tongDoanhThu = 0;
        for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : danhSachNgoaiThanh) {
            tongDoanhThu += chuyenXeNgoaiThanh.getDoanhThu();
        }
        return tongDoanhThu;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        while (true) {
            System.out.println("\n1.Nhap chuyen xe : ");
            System.out.println("2.Xuat danh sach :");
            System.out.println("3.Tinh tong doanh thu noi thanh : ");
            System.out.println("4.Tinh tong danh thu : ");
            System.out.println("5.Thoat");
            System.out.println("Chon chuc nang: ");
            int chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon) {
                case 1:
                    quanLyChuyenXe.nhapChuyenXe(scanner);
                    break;
                case 2:
                    quanLyChuyenXe.xuatDanhSachChuyenXe();
                    break;
                case 3:
                    System.out.println("Tong doanh thu noi thanh : " + quanLyChuyenXe.tinhTongDoanhThuNoiThanh());
                    break;
                case 4:
                    System.out.println("Tong doanh thu ngoai thanh : " + quanLyChuyenXe.tinhTongDoanhThuNgoaiThanh());
                    break;
                case 5:
                    System.out.println("Thoat Chuong trinh :");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Lua chon khong hop le:");
            }
        }
    }
}
