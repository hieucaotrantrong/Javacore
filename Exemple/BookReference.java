package Exemple;

import java.util.Scanner;

public class BookReference extends Book {

    public BookReference(String codeBoook, double price, int quantity, String author, double taxation, double price2,
            Scanner scanner, int number) {
        super(codeBoook, price, quantity, author);
        this.taxation = taxation;
        price = price2;
        this.scanner = scanner;
        this.number = number;
    }

    private double taxation;
    private double price;
    private Scanner scanner;
    private int number;

    // Constructor

    public double getTaxation() {
        return taxation;
    }

    public double getPrice() {
        return price;
    }

    public void setTaxation(double taxation) {
        this.taxation = taxation;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void importBook() {
        System.out.println("Import taxation :");
        taxation = scanner.nextDouble();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + ",Taxation :" + this.taxation;
    }

}
