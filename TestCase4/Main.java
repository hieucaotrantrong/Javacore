package TestCase4;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1021966858, "Cao Tran Trong Hieu", 1000.0);
        Account account2 = new Account(1021966878, "Dinh thi Phuong");
        /*
         * in thông tin các tài khoản ban đầu
         */
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        /*
         * Nạp tiền vào tài khoản
         */
        System.out.println("-----------------------");
        account1.napTien(200.0);
        System.out.println("Sau Khi nap tien :  ");
        System.out.println(account1.toString());
        /*
         * Rút tiền từ tài khoản
         */
        account1.rutTien(20.0, 2.0);
        System.out.println("Sau khi rut tien : ");
        System.out.println(account1.toString());
        /*
         * đáo hạn tài khoản
         */
        account1.daoHan();
        System.out.println("Sau khi dao han : ");
        System.out.println(account1.toString());
        /*
         * chuyển khoản từ account 1 sang account 2
         */
        account1.chuyenKhoan(account2, 160.0);
        System.out.println("Sau khi chuyen khoan : ");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

    }
}
