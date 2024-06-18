package TestCase1;

public class Vehicle {
    private String tenChuXe;
    private String nhanHieu;
    private float giaTri;
    private int dungTichXiLanh;

    // -----------Constructor------------
    public Vehicle(String tenChuXe, String nhanHieu, float giaTri, int dungTichXiLanh) {
        this.tenChuXe = tenChuXe;
        this.nhanHieu = nhanHieu;
        this.giaTri = giaTri;
        this.dungTichXiLanh = dungTichXiLanh;
    }

    // ----------GetSet------------------
    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        this.dungTichXiLanh = dungTichXiLanh;
    }

    // ---------------Method------------------
    public double tinhThue() {
        if (dungTichXiLanh < 100) {
            return giaTri * 0.01;
        } else if (dungTichXiLanh <= 200) {
            return giaTri * 0.03;
        } else {
            return giaTri * 0.05;
        }
    }

    public void hienThiThongTinXe() {
        System.out.printf("%-20s %-15s %-10d %15.2f %15.2f%n",
                tenChuXe, nhanHieu, dungTichXiLanh, giaTri, tinhThue());
    }
}
