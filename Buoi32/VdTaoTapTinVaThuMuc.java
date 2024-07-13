package Buoi32;

import java.io.File;
import java.io.IOException;

public class VdTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        /*
         * Lưu ý: Ms window:"c:\\ThuMuc1\\Thumuc\\Tentaptin.java"
         * linux, Macos;/Thumuc1/ThuMuc2/TenTaptin.java
         */
        // Exitts=> Kiểm tra thư mục hoặc tập tin có tồn tại hay không
        File folder1 = new File("E:\\FileTH\\Java\\Buoi32");
        File folder2 = new File("E:\\FileTH\\Java\\Buoi40");
        System.out.println("Kiem Tra folder1 co ton tai hay khong: " + folder1.exists());
        System.out.println("Kiem tra folder2 co ton tai hay khong: " + folder2.exists());
        /*
         * Tạo thư mục
         * Phương thức mkdir()=> tạo 1 thư mục
         */
        File folder11 = new File("E:\\\\FileTH\\\\Java\\\\Buoi32\\\\Directory_1");
        folder11.mkdir();
        /*
         * Phương thưc
         * mkdirs=> tạo nhiều thư mục cùng 1 lúc
         */
        File files = new File("E:\\\\FileTH\\\\Java\\\\Buoi32\\\\Directory_1\\\\Directory_2\\\\Dicretory_3");
        files.mkdirs();
        /*
         * tạo ra một tập tin( có phần mở rộng: .exe.doc.xls)
         */
        File file1 = new File("E:\\\\\\\\FileTH\\\\\\\\Java\\\\\\\\Buoi32\\\\\\\\Directory_1\\\\\\Vidu1_txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            /*
             * có nhiều lỗi sảy ra
             * Không có quyên tạo tập tin
             * ổ cứng bị đầy
             * đường dẫn bị sai
             */
            e.printStackTrace();
        }
    }
}
