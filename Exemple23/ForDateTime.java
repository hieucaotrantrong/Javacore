package Exemple23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ForDateTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatter);
        System.out.println("After formatting: " + formattedDate);
    }
}