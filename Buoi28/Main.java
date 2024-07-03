package Buoi28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Hàng đợi trong java
 * Queue
 */
public class Main {
    public static void main(String[] args) {
        Queue<String> danhSachSv = new LinkedList<String>();
        danhSachSv.offer("Cao Hieu 1");
        danhSachSv.offer("Dinh Thi Phuong 2");
        danhSachSv.offer("Tuan Hung 3");

        while (true) {
            String ten = danhSachSv.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
