package Exemple20;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Cao Tran Trong Hieu");
        sep.setLoaiChucVu(Configs.Nhan_Vien_Sep);
        NhanVienFullTime nhanvien1 = new NhanVienFullTime("Dinh Thi Phuong");
        NhanVienFullTime nhanvien2 = new NhanVienFullTime("Nguyen Trong Nghia");
        // Cong Ty dang thue mot nhan vien partime
        NhanVienPartTime partTime = new NhanVienPartTime("Cao Tran Tuan Hung", 48);
        sep.tinhLuong();
        nhanvien1.tinhLuong();
        nhanvien2.tinhLuong();
        partTime.tinhLuong();
        // In thong tin Nhan vien
        sep.xuatThongTin();
        nhanvien1.xuatThongTin();
        nhanvien2.xuatThongTin();
        partTime.xuatThongTin();
    }
}