package Buoi39;

/*
 * Bài 74 Cách đọc đối tượng từ tập tin
 */
import java.io.Serializable;
import java.util.Objects;

/*
 * Bài tập quản lý danh sách sinh viên sử dụng ArrayList
 */
public class SinhVien implements Comparable<SinhVien>, Serializable {
    private String maSinhVien, hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public SinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien : [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
                + ", diemTrungBinh=" + diemTrungBinh + "]";
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diemTrungBinh, getHoVaTen(), maSinhVien, namSinh);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        return Objects.equals(maSinhVien, other.maSinhVien);
    }
}