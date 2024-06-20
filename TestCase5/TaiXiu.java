package TestCase5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        Scanner scanner = new Scanner(System.in);
        Locale lc = new Locale("vi", "Vn");
        // NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int luaChon = 1;
        do {
            System.out.println("--------MOI BAN LUA CHON-----------");
            System.out.println("Chon(1) de tiep tuc choi.");
            System.out.println("Chon(phim bat ky) de thoat.");
            luaChon = scanner.nextInt();
            if (luaChon == 1) {
                System.out.println("***BAT DAU CHOI: ");
                /*
                 * đặt cược
                 */
                System.out.println(
                        "*** Tai khoan cua ban : " + numf.format(taiKhoanNguoiChoi) + ",Moi ong chu vao tien ? :");
                double datCuoc = 0;
                do {
                    System.out.println("****Moi ong chu dat cuoc : " + numf.format(taiKhoanNguoiChoi) + " <= ");

                    datCuoc = scanner.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
                /*
                 * Lựa chọn tài xỉu
                 */
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("**Chon:1-> Tai or 2->Xiu");
                    luaChonTaiXiu = scanner.nextInt();
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                /*
                 * Tung xúc sắc
                 */
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();
                int giaTri1 = xucXac1.nextInt(5) + 1;
                int giaTri2 = xucXac2.nextInt(5) + 1;
                int giaTri3 = xucXac3.nextInt(5) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;
                /*
                 * Tính toán kết quả
                 */
                System.out.println("Ket qua: " + giaTri1 + "-" + giaTri2 + "-" + giaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("**Tong la: " + tong + "-> Nha cai an het ban da thua!");
                    System.out.println("**Tai Khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("Tong la: " + tong + "-> Xiu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("**Ban da thang cuoc :");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****Tai Khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("**Ban da thua cuoc");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("***Tai khoan cua ban la" + numf.format(taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("Tong la: " + tong + "-> Tai");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("**Ban da thang cuoc :");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****Tai Khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("**Ban da thua cuoc");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("***Tai khoan cua ban la : " + numf.format(taiKhoanNguoiChoi));
                    }
                }
            }
        } while (luaChon == 1);
    }
}
