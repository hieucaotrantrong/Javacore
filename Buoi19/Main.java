package Buoi19;

public class Main {
    public static void main(String[] args) {

        ToaDo toaDo1 = new ToaDo(5, 5);
        ToaDo toaDo2 = new ToaDo(7, 9);
        ToaDo toaDo3 = new ToaDo(9, 1);
        System.out.println("----------");

        Hinh hinh1 = new Diem(toaDo1);
        Hinh hinh2 = new HinhTron(toaDo2, 10);
        Hinh hinh3 = new HinhChuNhat(toaDo3, 5, 10);

        System.out.println("--------");
        System.out.println("Dien tich 1 : " + hinh1.tinhDienTich());
        System.out.println("Dien tich 2 : " + hinh2.tinhDienTich());
        System.out.println("Dien tich 3 : " + hinh3.tinhDienTich());
    }
}
