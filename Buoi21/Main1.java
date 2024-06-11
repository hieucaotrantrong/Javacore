
public class Main1 {
    /*
     * So sánh chuỗi trong java
     */

    public static void main(String[] args) {
        String name1 = "Cao Tran Trong Hieu";
        String name2 = "Cao Tran Trong Hieu";
        String name3 = "cao tran trong hieu";
        // Hàm equals=> so sánh 2 chuỗi giống nhau, phân biệt hoa thường
        System.out.println("Name1 equals name2 : " + name1.equals(name2));
        System.out.println("Name1 euqals Name3 : " + name1.equals(name3));
        // Hàm equalsIgnoreCase=>so sánh 2 chuỗi giống nhau, không phân biệt chữ hoa
        // thường
        System.out.println("------------------------");
        System.out.println("Name1 equalsIgnoreCase name2 : " + name1.equalsIgnoreCase(name2));
        System.out.println("Name1 equalsIgnoreCase Name3 : " + name1.equalsIgnoreCase(name3));
        // Hàm compareTo=> so sánh <>=
        System.out.println("--------------------");
        String namesv1 = "Nguyen Van A";
        String namesv2 = "Nguyen Van B";
        String namesv3 = "Nguyen Van";
        String namesv4 = "Nguyen Van A";
        System.out.println("Namesv1 compareTo Name2 : " + namesv1.compareTo(namesv2));
        System.out.println("Namesv1 compareTo Name3 : " + namesv1.compareTo(namesv3));
        System.out.println("Namesv1 compareTo Name4 : " + namesv1.compareTo(namesv4));
        // Hàm compareTo=> so sánh <>= không so sánh chữ hoa chữ thường
        System.out.println("Namesv1 compareTo Name2 : " + namesv1.compareToIgnoreCase(namesv2));
        System.out.println("Namesv1 compareTo Name3 : " + namesv1.compareToIgnoreCase(namesv3));
        System.out.println("Namesv1 compareTo Name4 : " + namesv1.compareToIgnoreCase(namesv4));
        // Hàm regionMatches=> So sánh 1 đoạn
        System.out.println("-----------------------------");
        String firtname = "Cao Hieu";
        String firtname1 = "Cao Hieu";
        Boolean check = firtname.regionMatches(1, firtname1, 0, 7);
        System.out.println(check);
        // hàm startWith=> hàm kiểm tra chuỗi bắt đầu....TrueF
        System.out.println("----------------------------");
        String phoneNumber = "037456789";
        System.out.println("Ket qua la : " + phoneNumber.startsWith("037"));
        System.out.println("Ket qua la : " + phoneNumber.startsWith("034"));
        // Hàm endWith=> hàm kiểm tra chuỗi kết thúc bằng
        System.out.println("-------------------------");
        String nameFile1 = "I Love You.JPG";
        String nameFile2 = "Hoc Java.PDF";
        if (nameFile1.endsWith(".JPG")) {
            System.out.println("File 1 la hinh anh !");
        } else if (nameFile1.endsWith(".PDF")) {
            System.out.println("File 1 La PDF!");
        }
    }
}
