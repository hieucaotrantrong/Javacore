import java.util.Random;

import Buoi13.main;

public class TestCase {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("So ngau nhien la: " + randomNumber);
    }
}
