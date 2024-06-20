package TestCase4;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTaiKhoan;
    private static final double LAISUAT = 0.035;

    /*
     * Constructor mac dinh
     */
    public Account() {
        this.soTaiKhoan = 0;
        this.tenTaiKhoan = "";
        this.soTienTrongTaiKhoan = 0;
        /*
         * Constructor đầy đủ tham số
         */

    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    /*
     * có 2 đối số : số tài khoản, tên tài khoản, số tiền mặc định là 50
     */
    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = 50.0;
    }
    /*
     * GetSet
     */

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }
    /*
     * ToString
     */

    @Override
    public String toString() {
        NumberFormat currencyFormatter = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
        return "So tai khoan : " + soTaiKhoan + ",Ten tai khoan : " + tenTaiKhoan + ",So tien trong tai khoan : "
                + currencyFormatter.format(soTienTrongTaiKhoan);
    }

    /*
     * Method
     */
    /*
     * phương thức nạp tiền vào tài khoản
     */
    public void napTien(double soTien) {
        if (soTien > 0) {
            soTienTrongTaiKhoan += soTien;
        } else {
            System.out.println("So tien nap khong hop le");
        }
    }

    /*
     * Phương thức rút tiền
     */
    public void rutTien(double soTien, double phiRutTien) {
        if (soTien > 0 && (soTien + phiRutTien) <= soTienTrongTaiKhoan) {
            soTienTrongTaiKhoan -= (soTien + phiRutTien);
        } else {
            System.out.println("So tien rut khong hop le hoac khong du so du");
        }
    }

    /*
     * Phương thức đáo hạn
     */
    public void daoHan() {
        soTienTrongTaiKhoan += soTienTrongTaiKhoan * LAISUAT;
    }

    /*
     * Phương thức chuyển tiền từ tk này sang tk khác
     */
    public void chuyenKhoan(Account taiKhoanNhan, double soTien) {
        if (soTien > 0 && soTien <= soTienTrongTaiKhoan) {
            this.soTienTrongTaiKhoan -= soTien;
            taiKhoanNhan.napTien(soTien);
        } else {
            System.out.println("So tien chuyen khong hop le hoac khong du so du");
        }
    }
}