package Buoi27;

/*
Ngắn xếp trong java
 * Stack trong java collection
 */
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
        /*
         * stackChuoi.push("cao hieu"); // =>Đưa giá trị vào stack
         * stackChuoi.pop(); // => lấy giá trị ra, xóa khoi stack
         * stackChuoi.peek();// => Lấy giá trị ra nhưng không xóa khỏi stack
         * stackChuoi.clear();// =>Xóa tất cả phần tử trong stack
         * stackChuoi.contains("gia tri");// Xác định giá trị có tồn tại trong stack hay
         * không
         * stackChuoi.size();// => do lon cua stack
         */

        // Ví dụ đảo ngược chuỗi
        System.out.println("Nhap vao chuoi : ");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            stackChuoi.push(string.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc:");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println();
        // vd2 chuyển từ hệ thập phân sang nhi phân
        Stack<String> stacksoDu = new Stack<String>();
        System.out.print("Nhap 1 so nguyen duong tu phan phim : ");
        int number = scanner.nextInt();
        while (number > 0) {
            int soDu = number % 2;
            stacksoDu.push(soDu + "");
            number = number / 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stacksoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stacksoDu.pop());
        }
    }
}
