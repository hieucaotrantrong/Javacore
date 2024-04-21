import java.util.Scanner;

public class test {

   public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);

      // Nhập và kiểm tra giá trị của n
      do {
         System.out.println("Nhap vao so nguyen duong n (0 < n < 100):");
         n = sc.nextInt();
      } while (n <= 0 || n >= 100);

      System.out.println("Cac so chan tu 0 den " + n + " la:");

      // In ra các số chẵn từ 0 đến n
      for (int i = 0; i <= n; i += 2) {
         System.out.println(i);
      }
   }
}