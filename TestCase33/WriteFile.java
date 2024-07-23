package TestCase33;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("E:\\FileTH\\Java\\TestCase33\\filename.txt");
            fileWriter.write("File in Java Might be tricky, but it is fun enough!");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occyrred. ");
            e.printStackTrace();
        }
    }
}
