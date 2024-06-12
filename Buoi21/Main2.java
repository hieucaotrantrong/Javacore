public class Main2 {
    public static void main(String[] args) {
        String name1 = "Cao Tran Trong Hieu,Cao Hieu,Hieu Cao";
        String name2 = "Cao Hieu";
        String name3 = "Cao hieu 123";
        char name4 = 'H';
        /*
         * Hàm indexof
         */
        System.out.println("Vi tri cua name2 trong name1 la : " + name1.indexOf(name2));
        System.out.println("Vi tri cua name3 trong name1 la : " + name1.indexOf(name3));
        // sử dụng ví trí bắt đầu
        System.out.println("--------------------------");
        System.out.println("Vi tri cua name2 trong name1 la : " + name1.indexOf(name2, 3));
        // Tìm kiếm char
        System.out.println("--------------------------");
        System.out.println("Vi tri cua name2 trong name1 la : " + name1.indexOf(name4));
        System.out.println("Vi tri cua name2 trong name1 la : " + name1.indexOf(name2, 5));
        /*
         * lastIndexOf=> tìm kiếm từ phải sang trái
         */
        System.out.println("--------------------------");
        System.out.println("Vi tri cua cua name2 trong name1 la : " + name1.lastIndexOf(name2));
    }
}
