package Buoi22;

import java.util.Arrays;

public class Main {
    public static int[] reverse(int[] x) {
        int[] rs = new int[x.length];
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            rs[index] = x[i];
            index++;
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 4, 6, 7, 8, 9 };
        int[] b = new int[15];
        /*
         * Hàm sắp xếp tang dan
         */
        System.out.println("A Ban dau" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("A sau khi sap xep" + Arrays.toString(a));
        /*
         * Hàm tìm kiếm
         */
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));
        /*
         * Hàm điền giá trị
         */
        Arrays.fill(b, 5);
        System.out.println("B sau khi dien gia tri" + Arrays.toString(b));
        /*
         * Hàm sắp xếp giam dan
         */
        Arrays.sort(a);
        a = Main.reverse(a);
        System.out.println("A sau khi sap xep giam dan" + Arrays.toString(a));
    }
}