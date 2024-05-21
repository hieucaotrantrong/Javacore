package Exemple21;

public class XeDap extends PhuongTienDiChuyen {

    public XeDap(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        super("Xe Dap", hangSanXuat);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double layVanToc() {
        return 100;
    }

}
