package Exemple21;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String tenLoaiPhuongTien, String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 10000;
    }

    public void catCanh() {
        System.out.println("Cat canh");
    }

    public void haCanh() {
        System.out.println(" Ha Canh");
    }
}
