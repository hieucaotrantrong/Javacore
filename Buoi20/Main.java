package Buoi20;

public class Main {
    public static void main(String[] args) {
        // ------------------------------------------------
        System.out.println("--Test may tinh-- ");
        MayTinhCasioFX500 casio500 = new MayTinhCasioFX500();
        MayTinhVinaCal500 vnc500 = new MayTinhVinaCal500();
        System.out.println("Cong : " + casio500.cong(5, 3));
        System.out.println("Nhan : " + vnc500.nhan(4, 5));
        System.out.println("Chia : " + vnc500.chia(4, 0));
        // -------------------------------------------------
    }
}