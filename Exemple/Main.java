package Exemple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<TextBook> arrTextBook = new ArrayList<>();
        ArrayList<BookReference> arrBookReferences = new ArrayList<>();
        int numberTextBook, numberBookReferences;
        double totalTextBook = 0, totalBookReferences = 0,
                totalpriceBookRedferences = 0, arithMeticmeanPrice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number Text Book : ");
        numberTextBook = scanner.nextInt();
        System.out.println("Enter number Book References :");
        numberBookReferences = scanner.nextInt();
        // information text book
        System.out.println("Enter information Text Book :");
        for (int i = 0; i < numberTextBook; i++) {
            System.out.println("Enter information Book :" + (i + 1) + ":");
            TextBook textBook = new TextBook(null, totalpriceBookRedferences, i, null, null, arithMeticmeanPrice,
                    numberBookReferences, scanner);
            textBook.importBook();
            arrTextBook.add(textBook);
        }
        // Information BookReferences
        System.out.println("Enter information Book References : ");
        for (int i = 0; i < numberBookReferences; i++) {
            System.out.println("Enter information book :" + (i + 1) + ":");
            BookReference bookReference = new BookReference(null, totalpriceBookRedferences, i, null, i,
                    arithMeticmeanPrice, scanner, numberBookReferences);
            bookReference.importBook();
            arrBookReferences.add(bookReference);
        }
        // total price text book
        for (int i = 0; i < arrTextBook.size(); i++) {
            if (arrTextBook.get(i).getNumber() == 0) {
                totalTextBook += arrTextBook.get(i).getNumber() * arrTextBook.get(i).getPrice() * 50 / 100;

            } else if (arrTextBook.get(i).getNumber() == 0) {
                totalTextBook += arrTextBook.get(i).getNumber() * arrTextBook.get(i).getPrice();
            }
        }
        System.out.println("Total price text book : " + totalTextBook);
        // total price book references
        for (int i = 0; i < arrBookReferences.size(); i++) {
            totalBookReferences += arrBookReferences.get(i).getNumber() * arrBookReferences.get(i).getPrice()
                    + arrBookReferences.get(i).getTaxation();
        }
        System.out.println("Total price book references :" + totalBookReferences);
        System.out.println("----- Information text book------");
        for (int i = 0; i < arrTextBook.size(); i++) {
            System.out.println(arrTextBook.get(i).toString());
        }
        System.out.println("----- Information book references-----");
        for (int i = 0; i < arrBookReferences.size(); i++) {
            System.out.println(arrBookReferences.get(i).toString());

        }
        System.out.println("---Average unit price of references documents---");
        for (int i = 0; i < arrBookReferences.size(); i++) {
            totalBookReferences += arrBookReferences.get(i).getPrice();
            totalpriceBookRedferences = totalBookReferences / arrBookReferences.size();
        }
        System.out.println("Average unit price of references documents :" + totalpriceBookRedferences);
    }

}
