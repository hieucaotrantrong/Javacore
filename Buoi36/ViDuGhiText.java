package Buoi36;

import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("E:\\FileTH\\Java\\Buoi36/file.txt", "UTF-8");
            printWriter.println("Xin chao minh la hieu");
            printWriter.println("Du lieu");
            printWriter.println(3.14);
            printWriter.println("Toi chua thay ai thuc khuya day som ma than phien ve cuoc song cua minh ca");
            Student student = new Student(100, "Cao Tran trong hieu");
            printWriter.println(student);
            printWriter.flush();
            printWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
