package Buoi8;

import java.util.Scanner;

public class doWhile {
     public static void main(String[] args) {
          int n = 100;
          System.out.println("Nhap vap so nguyen n<=100:");
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
          while (n <= 0 || n >= 100)
               ;
          System.out.println("Cac so chan tu 0 den " + n + "la");
          for (int i = 0; i <= n; i += 2) {
               System.out.println(i);

          }
     }

}
