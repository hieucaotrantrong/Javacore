package Buoi28;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class VdPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSv = new PriorityQueue<String>();
        danhSachSv.offer("Cao Hieu 1");
        danhSachSv.offer("nghia nguyen 4");
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
