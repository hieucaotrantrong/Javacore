package Buoi24;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/*
 *Các lớp quản lý thời gian ngày tháng trong java
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Hàm lấy thời gian hiện tại
         */
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Truoc khi chay for : " + t1);
        System.out.println("Sau khi chay for : " + t2);
        System.out.println("Thoi gian : " + ((t2 - t1)) + "mls");
        System.out.println("Thoi gian : " + ((t2 - t1) / 1000) + "s");
        /*
         * TimeUnit
         */

        System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
        System.out.println("25h =" + TimeUnit.HOURS.toSeconds(25) + "s");
        /*
         * Date
         */
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        /*
         * Calendar
         */
        Calendar time = Calendar.getInstance();
        System.out.println(
                time.get(Calendar.DATE) + "-" + (time.get(Calendar.MONTH) + 1) + "-" + time.get(Calendar.YEAR));
        time.add(Calendar.HOUR, 10);
        System.out.println(
                time.get(Calendar.DATE) + "-" + (time.get(Calendar.MONTH) + 1) + "-" + time.get(Calendar.YEAR));
        time.add(Calendar.DATE, 14);
        System.out.println(
                time.get(Calendar.DATE) + "-" + (time.get(Calendar.MONTH) + 1) + "-" + time.get(Calendar.YEAR));
        /*
         * DateDformat
         */
        DateFormat dateFormat = new SimpleDateFormat();
        System.out.println(dateFormat.format(date));
        dateFormat = new SimpleDateFormat("yyyy-MMMMM-dd hh:mm:aaa");
    }
}
