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
        System.out.println("--Test thuat toan--");
        double[] arr = new double[] { 2, 1, 3, 4, 5, 6, 0 };
        double[] arr2 = new double[] { 6, 2, 7, 9, 3, 4, 5 };
        SapXepChen sxc = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();
        System.out.println("--Sap xep tang--");
        sxc.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            double d = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("--Sap xem giam--");
        sxchon.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        // --------------------------------------------
        System.out.println("--\nTest phan mem may tinh---");
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("Cong : " + pmmt.cong(3, 5));
        double[] arr3 = new double[] { 6, 2, 7, 9, 3, 4, 5 };
        pmmt.sapXepTang(arr3);
        for (int i = 0; i < arr.length; i++) {
            double d = arr[i];
            System.out.print(arr[i] + " ");
        }
    }

}