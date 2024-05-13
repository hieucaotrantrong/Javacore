package Exemple2;

public class HangSanXuat {
    private String tenHangSanXuat, quocGia;
    // constructor

    public HangSanXuat(String tenHangSanXuat, String quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;

    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

}
