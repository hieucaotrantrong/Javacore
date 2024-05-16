package Buoi16;
//  kế thừa trong java

public class HocSinh extends ConNguoi {

    private String tenLop, tenTruong;

    public HocSinh(String hoVaten, int namSinh, String tenLop, String tenTruong) {
        super(hoVaten, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public void lamBaiTap() {
        System.out.println("Da lam bai tap");
    }
}
