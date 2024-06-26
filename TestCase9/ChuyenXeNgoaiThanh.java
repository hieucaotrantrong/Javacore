package TestCase9;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaixe, String soXe, double doanhThu, String noiDen,
            int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaixe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(",Noi den " + noiDen + ",So ngay di duoc" + soNgayDiDuoc);
    }

}
