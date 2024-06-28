package TestCase11;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat)
            throws Exception {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double thanhTien() {
        // TODO Auto-generated method stub
        if ("A".equalsIgnoreCase(loaiDat)) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }

    public String getLoaiDat() {
        return loaiDat;
    }
}
