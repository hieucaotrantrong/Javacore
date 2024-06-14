package TestCase2;

public class SinhVien {
    /*
     * Attributes
     */
    private int Masv;
    private String hoVaTen;
    private float diemLT, diemTH;

    /*
     * constructor mặc dịnh
     */
    public void SinhVien() {
        this.Masv = 0;
        this.hoVaTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    /*
     * Constructor đầy đủ
     */
    public SinhVien(int masv, String hoVaTen, float diemLT, float diemTH) {
        Masv = masv;
        this.hoVaTen = hoVaTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    /*
     * getSet
     */
    public int getMaSV() {
        return Masv;
    }

    public void setMaSV(int Masv) {
        this.Masv = Masv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    /*
     * Method
     */
    public float tinhDiemTb() {
        return (diemLT + diemTH) / 2;
    }

    /*
     * To string
     */
    public boolean tinhDiemQuaMon() {
        return this.tinhDiemTb() >= 5;
    }

    @Override
    public String toString() {
        return "Ma sv: " + Masv + "\nHo Va Ten: " + hoVaTen + "\nDiemLT: " + diemLT + "\nDiem Th :" + diemTH;
    }

}
