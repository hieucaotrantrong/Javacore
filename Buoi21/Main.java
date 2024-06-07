import java.util.Scanner;

public class Main {
    // Làm việc với chuỗi trong java
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        System.out.println("Nhap vao chuoi cua ban :");
        name = scanner.nextLine();
        // ----------Length------------
        System.out.println("--------------");
        System.out.println("Do dai cua chuoi la : " + name.length());
        // -----------chartArt---------
        int viTri = name.length();
        for (int i = 0; i < viTri; i++) {
            System.out.println("Vi tri : " + i + " la " + ":" + name.charAt(i));
        }
        // ----------Getchar---------------
        System.out.println("---------------");
        char[] arr = new char[10];
        name.getChars(1, 3, arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Gia tri cua mang tai " + i + " la " + ":" + arr[i]);
        }
        // -----------getBytes---------------
        System.out.println("------------------");
        byte[] arr1 = name.getBytes();
        for (byte b : arr1) {
            System.out.println(b);
        }
    }
}
