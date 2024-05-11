package Exemple;

import java.util.Scanner;

public class BookReference {
    private double taxation;
    private double price;
    private Scanner scanner;
    private int number;

    // Constructor
    public BookReference(double taxation, double price) {
        this.taxation = taxation;
        this.price = price;
        this.scanner = new Scanner(System.in);
    }

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
