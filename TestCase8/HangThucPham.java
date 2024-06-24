package TestCase8;

import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class HangThucPham {
    /*
     * Attributes
     */
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    /*
     * Định dạng ngày và đơn giá
     */
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
}
