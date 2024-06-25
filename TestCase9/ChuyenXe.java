package TestCase9;

public class ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaixe;
    private String soXe;
    private double doanhThu;

    /*
     * Constructor
     */
    public ChuyenXe(String maSoChuyen, String hoTenTaixe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaixe = hoTenTaixe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    /*
     * GetSet
     */

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public String getHoTenTaixe() {
        return hoTenTaixe;
    }

    public String getSoXe() {
        return soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public void setHoTenTaixe(String hoTenTaixe) {
        this.hoTenTaixe = hoTenTaixe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    /*
     * GetSet
     */

    @Override
    public String toString() {
        return "ma so Chuyen" + maSoChuyen + ", hoTenTaixe=" + hoTenTaixe + ", soXe=" + soXe + ", doanhThu="
                + doanhThu;
    }

}
