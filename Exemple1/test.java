package Exemple1;

public class test {
    public static void main(String[] args) {
        // day
        day oneday = new day(10, 10, 2003);
        day twoday = new day(10, 10, 2003);
        day threeday = new day(10, 10, 2003);
        // author
        author oneAuthor = new author("Cao Tran Trong Hieu", oneday);
        author twoAuthor = new author("Dinh Thi Phuong", twoday);
        author threeAuthor = new author("Phuong Dinh", threeday);
        // book
        book oneBook = new book("Lap Trinh Java", 5000, 2024, oneAuthor);
        book twoBook = new book("Lap Trinh Django", 10000, 2026, twoAuthor);
        book threeBook = new book("Lap Trinh Python", 15000, 2026, threeAuthor);
        oneBook.printNameBook();
        twoBook.printNameBook();
        threeBook.printNameBook();
        // Sosanhxuatban
        System.out.println("So sanh sach 1 va 3 :" + oneBook.checkPublishYearToghether(threeBook));
        System.out.println("So sanh sach 2 va 3 :" + twoBook.checkPublishYearToghether(threeBook));
        // Gia sau khi giam
        System.out.println("Sach 1 giam 10 % :" + oneBook.priceAfterDown(10));
        System.out.println("Sach 2 giam 20 % :" + twoBook.priceAfterDown(20));
        System.out.println("Sach 3 giam 50 % :" + threeBook.priceAfterDown(50));
    }
}
