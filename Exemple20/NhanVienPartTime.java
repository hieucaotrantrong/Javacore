package Exemple20;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;// Tong so gio lam viec

    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "Nhan Vien Thoi vu";
    }

    public void tinhLuong() {
        luong = Configs.Luong_Lam_Them_Part_Tine_Moi_Gio * gioLamViec;

    }
}
