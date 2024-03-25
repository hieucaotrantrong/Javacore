package Buoi5;

public class mathAlone {
    public static void main(String[] args) {
        // các phép toán một ngôi trong lập trình
        int a = 5;
        boolean b = false;
        System.out.println(" -a => Giá tri:" + (-a));
        System.out.println(" +b => Giá tri:" + (+a));
        System.out.println(" !b => Giá tri:" + (!b));
        System.out.println("-----------");
        System.out.println("a=" + a);
        // đặt ++ trước biến thì tăng giá trị biến sau đó câu lệnh mới được thực hiện
        System.out.println("++a=" + (++a));
        // dặt-- sau biến thì chạy xong câu lệnh thì kq mới được xuất ra
        System.out.println("a++=" + (a++));
        // kết quả sẽ được in ra sau biến
        System.out.println("a=" + a);
        System.out.println("--a=" + (--a));
        System.out.println("a--=" + (a--));
        System.out.println("a=" + a);
    }

}
