public class Main3 {
    public static void main(String[] args) {
        /*
         * Nối chuỗi => concat
         */
        String name1 = "Cao Tran Trong Hieu";
        String name2 = "Cao Tran Tuan Hung";
        String name3 = name1 + name2;
        String name4 = name1.concat(name2);
        System.out.println("Name3 :" + name3);
        System.out.println("Name4 : " + name4);
        /*
         * Hàm replace=> thay thế ghi đè chuỗi
         */
        System.out.println("--------------------------");
        String name5 = "Hieu.com";
        String name6 = name5.replaceAll("Hieu", "Hung");
        System.out.println("Name6 =" + name6);
        /*
         * hàm ToLowerCase=> chuyển về viết thường
         * Hàm to UpperCase=> chuyển về viết hoa
         */
        System.out.println("--------------------------");
        String name7 = name1.toLowerCase();
        String name8 = name1.toUpperCase();
        System.out.println("Name7=" + name7);
        System.out.println("Name8=" + name8);
        /*
         * Hàm trim=>Xóa khoảng trắng dư thừa đầu chuỗi
         */
        System.out.println("--------------------------");
        String name9 = " Cao Tran Trong Hieu";
        System.out.println("name9=" + name9.trim());
        /*
         * hàm subString=> cắt chuỗi con
         */
        System.out.println("--------------------------");
        String name10 = "Xin chao cac ban, minh la Hieu";
        String name11 = name10.substring(15);
        String name12 = name10.substring(10, 15);
        System.out.println("Name11 = " + name11);
        System.out.println("Name12 = " + name12);
    }
}
