package TestCase10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sach {
    protected String maSach;
    protected Date ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) throws Exception {
        this.maSach = maSach;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.ngayNhap = formatter.parse(ngayNhap);
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double thanhTien() {
        return soLuong * donGia;
    }
}