package TestCase33;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObJ = new File("E:\\FileTH\\Java\\TestCase33\\Abc.txt");
            if (myObJ.createNewFile()) {
                System.out.println("File creted: " + myObJ.getName());

            } else {
                System.out.println("File already exixts.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
