package Buoi34;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class ViDuXoaFile {
    public static void xoaFile(File fx) {
        // xóa nếu là tập tin
        if (fx.isFile()) {
            System.out.println("Da xoa:" + fx.getAbsolutePath());
            fx.delete();
        } else if (fx.isDirectory()) {
            // lay cac file con
            File[] mangCon = fx.listFiles();
            for (File file : mangCon) {
                // xóa các file con
                xoaFile(file);
            }
            // xóa bản thân thư mục sau khi đã xóa các file con
            System.out.println("Da xoa:" + fx.getAbsolutePath());
            fx.delete();
        }
    }

    public static void xoaFile2(Path path) {
        boolean condition = true;
        if (condition) {
            try {
                Files.walk(path).sorted(Comparator.reverseOrder()).forEach(p -> {
                    try {
                        Files.deleteIfExists(p);
                        System.out.println("Da xoa: " + p);
                    } catch (IOException e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                });
            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // sử dụng class file de xoa tạp tin hoac thu muc
        File f0 = new File("E:\\FileTH\\Java\\Buoi34\\F0");
        File f0_1 = new File("E:\\FileTH\\Java\\Buoi34\\F0_1");
        File f_vidu = new File("E:\\FileTH\\Java\\Buoi34");
        f0.deleteOnExit(); // => xóa không được vì chưa có thư mục và tập tin
        /*
         * f0_1.deleteOnExit();// => xóa được vì thư mục rỗng
         * f_vidu.deleteOnExit(); // => xóa được vì là tập tin
         * System.out.println(f0_1.delete());
         * ViDuXoaFile.xoaFile(f0);
         */
        // sử dụng class file để xóa tập tin và thư mục

        Path path = f0.toPath();
        Path path_1 = f0_1.toPath();
        Path path_2 = f_vidu.toPath();
        try {
            Files.deleteIfExists(path);
            Files.deleteIfExists(path_1);
            Files.deleteIfExists(path_2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}