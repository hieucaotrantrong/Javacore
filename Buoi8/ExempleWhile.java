package Buoi8;

import java.util.Scanner;

public class ExempleWhile {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while (x != 0) {
            System.out.println("Nhap 0 de dung lai; Nhap so khac de tiep tuc");
            x = sc.nextInt();
        }
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 10) {
                break;
            }

        }
    }
}
