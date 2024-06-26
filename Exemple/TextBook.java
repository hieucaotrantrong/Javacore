package Exemple;

import java.util.Scanner;

import Exemple1.book;

public class TextBook extends Book {
    private String status;
    private double price;
    private int number;
    private Scanner scanner;

    // Constructor

    public String getStatus() {
        return status;
    }

    public TextBook(String codeBoook, double price, int quantity, String author, String status, double price2,
            int number, Scanner scanner) {
        super(codeBoook, price, quantity, author);
        this.status = status;
        price = price2;
        this.number = number;
        this.scanner = scanner;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String conditionBook(int x) {
        String condition;
        switch (number) {
            case 0:
                condition = "New";
                break;
            case 1:
                condition = "Old";
                break;
            default:
                condition = "Unknow";
                break;
        }
        return condition;
    }

    public void importBook() {

        System.out.println("Import condition book code(0- New / 1- Old) : ");
        number = scanner.nextInt();
    }

    public String toString() {
        return super.toString() + ",Condition :" + this.conditionBook(number);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
