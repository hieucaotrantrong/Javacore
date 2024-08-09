package Buoi38;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\FileTH\\Java\\Buoi38\\file.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            SinhVien sinhVien = new SinhVien("98861", "Cao Tran Trong Hieu", 2003, 10);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
