package TestCase7;

public class Main {
    /*
     * Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for
     * hoặc while)
     */
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        for (int i = 1; count < 10; i++) {
            if (i % 2 == 0) {
                total += i;
                count++;
            }
        }
        System.out.println(" Tong cua 10 so chan dau tien la : " + total);
    }
}
