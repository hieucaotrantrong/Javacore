package TestCase10;

import java.util.Date;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue)
            throws Exception {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }

}
