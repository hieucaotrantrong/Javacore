package Buoi12;

public class Main {
    public static void main(String[] args) {
        HoaDonCaPhe hoadon = new HoaDonCaPhe("Hieu Cao", 10, 10);
        System.out.println("Tong tien :" + hoadon.tinhTongTien());

        System.out.println("Kiem tra khoi luong >2kg :" + hoadon.kiemTraKhoiLuongLonHon(2));
    }
}
