package TestCase8;

import java.util.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class HangThucPham {
    /*
     * Attributes
     */
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    /*
     * Định dạng ngày và đơn giá
     */
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));

    /*
     * Constructor đẩy đủ tham số----------
     */
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngayHetHan, Date ngaySanXuat) {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma Hang khong duoc de rong");
        }
        this.maHang = maHang;
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    /*
     * Constructor chỉ có mã hàng
     */
    public HangThucPham(String maHang) {
        if (maHang == null || maHang.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma hang khong duowc de trong");
        }
        this.maHang = maHang;
        this.tenHang = "Khong xac dinh";
        this.donGia = 0;
        this.ngaySanXuat = new Date(0);
        this.ngayHetHan = new Date(0);
    }

    /*
     * get Set
     */
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang != null ? tenHang : "Khong xac dinh";
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia > 0 ? donGia : 0;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat != null ? ngaySanXuat : new Date(0);
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan != null && ngayHetHan.after(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = new Date(this.ngaySanXuat.getTime() + 86400000L);
        }
    }
    /*
     * toString
     */

    @Override
    public String toString() {
        return "Ma hang" + maHang + ", tenHang=" + tenHang + ", donGia=" + currencyFormat.format(this.donGia)
                + ", ngaySanXuat="
                + dateFormat.format(this.ngaySanXuat) + ", ngayHetHan=" + dateFormat.format(this.ngayHetHan);
    }

    public static void main(String[] args) {
        try {
            Date ngaySanXuat = (Date) dateFormat.parse("10/10/2023");
            Date ngayHetHan = (Date) dateFormat.parse("10/10/2024");
            HangThucPham hangThucPham = new HangThucPham("001", "Sua", 1500, ngaySanXuat, ngayHetHan);
            System.out.println(hangThucPham);
            HangThucPham hangThucPham2 = new HangThucPham("002");
            System.out.println(hangThucPham2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}