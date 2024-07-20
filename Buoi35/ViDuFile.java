package Buoi35;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
    public static void copyAll(File f1, File f2) {
        try {
            /*
             * Copy bản thân nó trước
             */
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        if (f1.isDirectory()) {
            // Copy các tập tin và thu mục con
            File[] mangCon = f1.listFiles();
            for (File file : mangCon) {
                File file_new = new File(f2.getAbsolutePath() + "/" + file.getName());
                copyAll(file, file_new);
            }
        }
    }

    public static void main(String[] args) {
        File f0 = new File("E:\\FileTH\\Java\\Buoi35\\File_1.txt");
        File f1 = new File("E:\\FileTH\\Java\\Buoi35\\File_2.txt");
        File f2 = new File("E:\\FileTH\\Java\\Buoi35\\File_2xyz.txt");
        /*
         * 1. Thay đổi tập tin hoặc thư mục
         * sử dụng File để thay đổi tên
         * Thông qua hàm renameto()
         */
        f0.renameTo(f1);
        /*
         * Sử dụng files để thay đổi tên
         */

        try {
            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        /*
         * 2. Di chuyển file
         */

        File f_2new = new File("E:\\\\FileTH\\\\Java\\\\Buoi35\\\\F0\\\\File_2xyz.txt");
        try {
            Files.move(f2.toPath(), f_2new.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        /*
         * 3.Copy file
         */
        File f_0 = new File("E:\\FileTH\\Java\\Buoi35\\F0");
        File f_0_copy = new File("E:\\\\FileTH\\\\Java\\\\Buoi35\\\\F0_copy");

        try {
            Files.copy(f_0.toPath(), f_0_copy.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        ViDuFile.copyAll(f_0, f_0_copy);
    }
}