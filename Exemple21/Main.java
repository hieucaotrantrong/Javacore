package Exemple21;

public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Laboghini", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("Toyota", "Han Quoc");
        HangSanXuat h3 = new HangSanXuat("MayBach", "Duc");
        System.out.println("-----");
        PhuongTienDiChuyen p1 = new XeOto("Maybach", "Xang", h1);
        MayBay p2 = new MayBay("May bay", "Xang", h2);
        PhuongTienDiChuyen p3 = new XeDap("Xe dap dua ", h3);
        System.out.println("---Lay Hang san Xuat---");
        System.out.println(" Hang san Xuat p1 : " + p1.layTenHangSanXuat());

        System.out.println("Bat dau : ");
        p2.batDau();

        System.out.println("Lay Van toc :");
        System.out.println("P1 : " + p1.layVanToc());
        System.out.println("P2 : " + p2.layVanToc());
        System.out.println("P3 : " + p3.layVanToc());

        System.out.println(" Cat canh :");
        p2.catCanh();
    }
}
