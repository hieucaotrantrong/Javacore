package Buoi23;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaten, tenLop;
    private double diemTrungBinh;

    /*
     * Constructor
     */
    public SinhVien(int maSinhVien, String hoVaten, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaten = hoVaten;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }
    /*
     * getSet
     */

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public String getTenLop() {
        return tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public int compareTo(SinhVien o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");https://meet.google.com/fje-nwgg-gpr
    }

}
