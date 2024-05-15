package Exemple4;

public class main {
    public static void main(String[] args) {

        System.out.println("---Ngay---");
        Ngay ngay1 = new Ngay(10, 10, 2024);
        Ngay ngay2 = new Ngay(11, 10, 2024);
        Ngay ngay3 = new Ngay(18, 6, 2024);

        System.out.println("--- Quoc gia---");
        QuocGia quocGia1 = new QuocGia("Vn", "Viet Nam");
        QuocGia quocGia2 = new QuocGia("JP", "Japan");
        QuocGia quocGia3 = new QuocGia("KR", "Korea");

        System.out.println("Hang san xuat---");
        HangSanXuat hangSanXuat1 = new HangSanXuat("Macbook", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Lenovo", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Dell", quocGia3);

        System.out.println("---May tinh---");
        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 1500, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 2000, 15);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 1000, 18);

        System.out.println("--So sanh gia--- ");
        System.out.println("So sanh may 1 va may 2 :" + mayTinh1.kiemTraGiaThapHon(mayTinh2));
        System.out.println("So sanh may 1 va may 3 :" + mayTinh1.kiemTraGiaThapHon(mayTinh3));

        System.out.println("Ten quoc gia---");
        System.out.println(" May tinh 1 : " + mayTinh1.layTenQuocGia());
        System.out.println(" May tinh 2 : " + mayTinh2.layTenQuocGia());
        System.out.println(" May tinh 3 : " + mayTinh3.layTenQuocGia());
        System.out.println("Ngay san xuat :" + ngay1.getNgay());
    }
}
