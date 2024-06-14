package TestCase3;

public class HinhChuNhat {
    /*
     * Attributes
     */
    private double chieuDai, chieuRong;

    /*
     * Constructor
     */
    public void HinhChuNHat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;

    }

    /*
     * Getset
     */
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    /*
     * Method
     */
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "Chieu dai hinh chu nhat: " + chieuDai + ",Chieu rong hinh chu nhat:" +
                chieuRong + ",Chu vi hinh chu nhat :" + tinhChuVi() + ",Dien tich chu nhat:" + tinhDienTich();

    }
}
