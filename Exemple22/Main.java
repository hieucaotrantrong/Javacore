package Exemple22;

import java.util.Arrays;

/*
  * Cách phân tách chuỗi thành mảng trang java
  */
public class Main {
  public static void main(String[] args) {
    String name = "Xin chao cac ban, tui la hieu";
    String[] name1 = name.split(" ");
    System.out.println(Arrays.toString(name1));
    String name2 = "Xin chao, minh la phuong.Minh la lap trinh vien!";
    String[] name3 = name2.split("\\.|\\,");
    System.out.println(Arrays.toString(name3));
    String name4 = "Cao Tran Trong Hieu";
    String[] name5 = name4.split(" ");
    System.out.println(Arrays.toString(name5));
    System.out.println("Ten : " + name5[name5.length - 1]);
  }
}
