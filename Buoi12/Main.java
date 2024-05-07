package Buoi12;

public class Main {
    public static void main(String[] args) {
        HoaDonCaPhe hoadon = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
        HoaDonCaPhe hoadon2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
        System.out.println("Tong tien hoadon :" + hoadon.tinhTongTien());
        System.out.println("Tong tien hoa don2 :" + hoadon2.tinhTongTien());
        System.out.println("Kiem tra khoi luong >2kg :" + hoadon.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem tra tong tien >500k:" + hoadon.kiemTraTongTienLonHon500k());
        System.out.println("Giam gia cua hoa don :" + hoadon.giamGia(10));
        System.out.println("Giam gia cua hoadon2 :" + hoadon2.giamGia(10));
        System.out.println("Sau giam gia cua hoa don :" + hoadon.giaSauKhiGiam(10));
        System.out.println("Sau giam gia cua hoa on2 :" + hoadon2.giaSauKhiGiam(10));
    }
}
