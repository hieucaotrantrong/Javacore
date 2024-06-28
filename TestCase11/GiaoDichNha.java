package TestCase11;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) throws Exception {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public double thanhTien() {
        if ("cao cap".equalsIgnoreCase(loaiNha)) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

}
