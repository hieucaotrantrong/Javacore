package Buoi37;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ViDuDocText {
    public static void main(String[] args) {
        /*
         * Cách 1
         * File file = new File("E:\\FileTH\\Java\\Buoi36\\file.txt");
         * try {
         * BufferedReader bufferedReader = Files.newBufferedReader(file.toPath(),
         * StandardCharsets.UTF_8);
         * String line = null;
         * while (true) {
         * line = bufferedReader.readLine();
         * if (line == null) {
         * break;
         * } else {
         * System.out.println(line);
         * }
         * }
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */
        /*
         * Cách 2
         */
        File file2 = new File("E:\\\\FileTH\\\\Java\\\\Buoi36\\\\file.txt");
        try {
            List<String> allText = Files.readAllLines(file2.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
