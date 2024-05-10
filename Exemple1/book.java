package Exemple1;

public class book {
    // abtribute
    private String nameBook;
    private double price;
    private int yearPublishing;
    private author author;

    // contructor
    public book(String nameBook, double price, int yearPublishing, Exemple1.author author) {
        this.nameBook = nameBook;
        this.price = price;
        this.yearPublishing = yearPublishing;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public double getPrice() {
        return price;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public author getAuthor() {
        return author;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setAuthor(author author) {
        this.author = author;
    }

    public void printNameBook() {
        System.out.println(this.nameBook);
    }

    public boolean checkPublishYearToghether(book ortherBook) {
        // if (this.yearPublishing == ortherBook.yearPublishing) {
        // return true;
        // } else {
        // return false;
        // }
        return this.yearPublishing == ortherBook.yearPublishing;
    }

    public double priceAfterDown(double x) {
        return this.price * (1 - x / 100);
    }
}
