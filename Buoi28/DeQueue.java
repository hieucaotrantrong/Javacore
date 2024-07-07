package Buoi28;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DeQueue {
    public static void main(String[] args) {
        Deque<String> danhSachSv = new ArrayDeque<String>();
        danhSachSv.offer("Cao Hieu 1");
        danhSachSv.offer("Dinh Thi Phuong 2");
        danhSachSv.offer("Tuan Hung 3");
        danhSachSv.offerLast("Cao Hieu 5");
        danhSachSv.offerFirst("Cao Hieu 0");
        while (true) {
            String ten = danhSachSv.poll();
            if (ten == null) {  
                break;
            }
            System.out.println(ten);
        }
    }
}
