package Exemple4;

public class HangSanXuat {
    private String tenHangSanXuat;
    private QuocGia quocGia;

    // constructor
    public HangSanXuat(String tenHangSanXuat, QuocGia quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public String layTenQuocGia() {
        // TODO Auto-generated method stub
        return this.quocGia.getTenQUocGia();
    }

}
