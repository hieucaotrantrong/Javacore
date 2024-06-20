package Buoi22;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(98861, "Cao Tran Trong Hieu", "IT22H", 9);
        SinhVien sinhVien2 = new SinhVien(98862, "Cao Tran Tuan Hung", "IT23H", 7);
        SinhVien sinhVien3 = new SinhVien(98863, "Dinh Thi Phuong", "IT21H", 8);
        SinhVien[] a_sv = new SinhVien[] { sinhVien1, sinhVien2, sinhVien3 };
        /*
         * hàm sắp xếp
         */

        System.out.println("Ban dau :" + Arrays.toString(a_sv));
        Arrays.sort(a_sv);
        System.out.println("-----------------------");
        System.out.println("Sau khi sap xep : " + Arrays.toString(a_sv));
        /*
         * hàm tìm kiếm
         */
        System.out.println("Tim kiem hieu : " + Arrays.binarySearch(a_sv, sinhVien1));
    }
}
