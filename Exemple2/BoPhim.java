package Exemple2;

public class BoPhim {
    private String tenPhim;
    private int namSanxuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;

    // constructor
    public BoPhim(String tenPhim, int namSanxuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanxuat = namSanxuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getNamSanxuat() {
        return namSanxuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public void setNamSanxuat(int namSanxuat) {
        this.namSanxuat = namSanxuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
        return this.giaVe < phimKhac.giaVe;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public double giaSauKhuyenMai(double x) {
        return this.giaVe * (1 - x / 100);
    }
}
