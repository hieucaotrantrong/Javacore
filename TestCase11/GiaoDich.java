package TestCase11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GiaoDich {
    protected String maGiaoDich;
    protected Date ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) throws Exception {
        this.maGiaoDich = maGiaoDich;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.ngayGiaoDich = formatter.parse(ngayGiaoDich);
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public double thanhTien() {
        return 0;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

}
