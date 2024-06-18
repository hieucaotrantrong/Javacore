package TestCase1;

public class Vehicle {
    private String nhanHieu;
    private float giaTri;
    private int dungTichXILanh;
    private String tenChuXe;

    /*
     * Constructor
     * 
     */
    public Vehicle(String nhanHieu, String tenChuXe, float giaTri, int dungTichXILanh) {
        this.nhanHieu = nhanHieu;
        this.tenChuXe = tenChuXe;
        this.giaTri = giaTri;
        this.dungTichXILanh = dungTichXILanh;
    }
    /*
     * Get Set
     */

    public String getNhanHieu() {
        return nhanHieu;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public int getDungTichXILanh() {
        return dungTichXILanh;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }

    public void setDungTichXILanh(int dungTichXILanh) {
        this.dungTichXILanh = dungTichXILanh;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    /*
     * Method
     */
    public double tinhThue() {
        if (dungTichXILanh < 100) {
            return giaTri * 0.01;
        } else if (dungTichXILanh <= 200) {
            return giaTri * 0.03;
        } else {
            return giaTri * 0.05;
        }
    }

    public void hienThiThongTinxe() {
        System.out.printf("Hien thi thong tin cac loai xe", tenChuXe, nhanHieu, dungTichXILanh, giaTri, tinhThue());
    }
    /*
     * To String
     */

}