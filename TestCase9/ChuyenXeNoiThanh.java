package TestCase9;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private int soKmDiDuoc;

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaixe, String soXe, double doanhThu, int soTuyen,
            int soKmDiDuoc) {
        super(maSoChuyen, hoTenTaixe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(",So tuyen " + soTuyen + "So km di duoc : " + soKmDiDuoc);
    }

}
