package Buoi26;

/*
 * Bài tập quản lý danh sách sinh viên sử dụng ArrayList
 */
public class SinhVien implements Comparable<SinhVien> {
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

    // Phương thức sai chờ xử lí
    /*
     * @Override
     * public int hashCode() {
     * final int prime = 31;
     * int result = 1;
     * result = prime * result + ((maSinhVien == null) ? 0 : maSinhVien.hashCode());
     * result = prime * result + ((hoVaTen == null) ? 0 : hoVaTen.hashCode());
     * result = prime * result + namSinh;
     * result = prime * result + Float.floatToIntBits(diemTrungBinh);
     * return result;
     * }
     * 
     * @Override
     * public boolean equals(Object obj) {
     * if (this == obj)
     * return true;
     * if (obj == null)
     * return false;
     * if (getClass() != obj.getClass())
     * return false;
     * SinhVien other = (SinhVien) obj;
     * if (maSinhVien == null) {
     * if (other.maSinhVien != null)
     * return false;
     * } else if (!maSinhVien.equals(other.maSinhVien))
     * return false;
     * if (hoVaTen == null) {
     * if (other.hoVaTen != null)
     * return false;
     * } else if (!hoVaTen.equals(other.hoVaTen))
     * return false;
     * if (namSinh != other.namSinh)
     * return false;
     * if (Float.floatToIntBits(diemTrungBinh) !=
     * Float.floatToIntBits(other.diemTrungBinh))
     * return false;
     * return true;
     * }
     */
}
