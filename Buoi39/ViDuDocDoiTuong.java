package Buoi39;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 |---------------------------------------
 Buổi 74. Cách đọc dữ liệu từ file
 |---------------------------------------

 */
public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\FileTH\\Java\\Buoi39");
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            SinhVien sinhVien = (SinhVien) objectInputStream.readObject();
            System.out.println(sinhVien);
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
