package Exemple3;

public class Lop {
    private String tenLop, tenKhoa;

    // constructor
    public Lop(String tenLop, String tenKhoa) {
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

}
