package Exemple4;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Ngay ngaySanXuat;
    private double giaBan;
    private double thoigianBaoHanh;
    // constructor

    public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, double thoigianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoigianBaoHanh = thoigianBaoHanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public Ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public double getThoigianBaoHanh() {
        return thoigianBaoHanh;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNgaySanXuat(Ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setThoigianBaoHanh(double thoigianBaoHanh) {
        this.thoigianBaoHanh = thoigianBaoHanh;
    }

    public boolean kiemTraGiaThapHon(MayTinh mayTinhKhac) {
        return this.giaBan < mayTinhKhac.giaBan;
    }

    public String layTenQuocGia() {
        return this.hangSanXuat.layTenQuocGia();
    }
}
