package TestCase10;

import java.util.Date;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang)
            throws Exception {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double thanhTien() {
        if ("moi".equalsIgnoreCase(tinhTrang)) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

}
