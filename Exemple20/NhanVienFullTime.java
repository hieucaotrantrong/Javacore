package Exemple20;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = Configs.Nhan_Vien_Linh;
    }

    public NhanVienFullTime(int ten, int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Configs.Nhan_Vien_Linh;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    protected String loaiNhanVien() {
        if (loaiChucVu == Configs.Nhan_Vien_Linh) {
            return "Nhan vien Toan Thoi gian" + (ngayLamThem > 0 ? "Co lam them Ngay" : " ");
        } else {
            return "Sep Toan Thoi Gian" + (ngayLamThem > 0 ? "Co lam them ngay" : "");

        }
    }

    public void tinhLuong() {
        if (loaiChucVu == Configs.Nhan_Vien_Linh) {
            luong = Configs.Luong_Nhan_Vien_Full_Time_Linh + ngayLamThem * Configs.Luong_Lam_Them_Moi_Ngay;
        } else if (loaiChucVu == Configs.Nhan_Vien_Sep) {
            luong = Configs.Luong_Nhan_Vien_Full_Time_Sep + ngayLamThem * Configs.Luong_Lam_Them_Moi_Ngay;
        }
    }

}
