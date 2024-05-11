package Exemple;

import java.util.Scanner;

public class Book {
    // Attributes
    private String codeBook;
    private double price;
    private int quantity;
    private String author;
    Scanner scanner = new Scanner(System.in);

    // conrtrustor
    public Book(String codeBoook, double price, int quantity, String author) {
        this.codeBook = codeBoook;
        this.price = price;
        this.quantity = quantity;
        this.author = author;

    }

    public String getCodeBook() {
        return codeBook;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void importExportBook() {
        System.out.println("Import codeBook: ");
        codeBook = scanner.nextLine();
        System.out.println("Import author :");
        author = scanner.nextLine();
        System.out.println("Import priceBook: ");
        price = scanner.nextDouble();
        System.out.println("Import quantity :");
        quantity = scanner.nextInt();

    }

    @Override
    public String toString() {
        return "Code Book : " + codeBook + ", PriceBook" + price + ", QuantityBook :" + quantity + ", Author :"
                + author;
    }

}
