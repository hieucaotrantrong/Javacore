package Buoi18;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println("Tim min : " + myMath.timMin(5, 10));
        System.out.println("Tim min : " + myMath.timMin(3.5, 4.5));
        System.out.println("Tinh Tong :" + myMath.tinhTong(6, 6));
        double arr[] = new double[] { 1, 2, 3, 4, 5, };
        System.out.println("Tinh tong mang : " + myMath.tinhTong(arr));
        
    }
}
