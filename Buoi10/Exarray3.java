package Buoi10;

/*

 * Các cách copy và sao chép mảng
 */
import java.util.Arrays;

public class Exarray3 {
    public static void main(String[] args) {
        /*
         * kiểu nguyên thủy
         */
        int[] mang1 = { 1, 2, 3 };
        /*
         * Copy mang
         */
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println("Mang 1: " + Arrays.toString(mang1));
        System.out.println("Mang 1_a: " + Arrays.toString(mang1_a));
        /*
         * copy dùng hàm clone
         */
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println("Mang1_b:" + Arrays.toString(mang1_b));
        /*
         * SysTem.arycopy
         */
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mang _1c:" + Arrays.toString(mang1_c));
    }

}
