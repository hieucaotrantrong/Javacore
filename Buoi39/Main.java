package Buoi39;

import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
    int luaChon = 0;
    do {
      System.out.println("**MENU**");
      System.out.println("Vui long chon chuc nang: ");
      System.out.println(
          "1.Them sinh vien vao danh sach.\n" +
              "2.In danh sach sinh vien ra man hinh.\n" +
              "3.Kiem tra danh sach co rong hay khong.\n" +
              "5.Lam rong danh sach sinh vien.\n" +
              "6.Kiem tra sinh vien co ton tai trong danh sach hay khong,dua tren ma sinh vien.\n" +
              "7.Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien .\n" +
              "8.Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.\n" +
              "9.Xuat ra danh sach sinh vien co diem tu cao den thap.\n" +
              "10.Luu danh sach sinh vien xuong tap tin.\n" +
              "11.Doc danh sach sinh vien tu tap tin.\n" +
              "0.Thoat khoi chuong trinh.\n");
      luaChon = scanner.nextInt();
      scanner.nextLine();
      if (luaChon == 1) {
        /*
         * Thêm sinh viên vào danh sách
         */
        System.out.println("Nhap ma sinh vien : ");
        String maSinhVien = scanner.nextLine();
        System.out.println("Nhap Ho va Ten : ");
        String hoVaTen = scanner.nextLine();
        System.out.println("Nhap nam sinh : ");
        int namSinh = scanner.nextInt();
        System.out.println("Nhap diem trung binh: ");
        float diemTrungBinh = scanner.nextFloat();
        SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
        danhSachSinhVien.themSinhVien(sinhVien);
      } else if (luaChon == 2) {
        /*
         * In danh sách sinh viên
         */
        danhSachSinhVien.inDanhSachSinhVien();
      } else if (luaChon == 3) {
        /*
         * Kiểm tra danh sách sinh viên có rỗng hay không
         */
        System.out.println("Kiem tra danh sach rong : " + danhSachSinhVien.kiemTraDanhSachRong());
      } else if (luaChon == 4) {
        /*
         * Lấy ra số lượng sinh viên trong danh sach
         */
        System.out.println("So luong hien tai : " + danhSachSinhVien.laySoLuongSinhVien());
      } else if (luaChon == 5) {
        /*
         * Lam rong danh sach sinh vien
         */
        danhSachSinhVien.lamRongDanhSach();
      } else if (luaChon == 6) {
        /*
         * Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh
         * viên
         */
        // Phương thức sai chờ xử lí
        System.out.println("Nhap ma sinh vien : ");
        String maSinhVien = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(maSinhVien);
        System.out.println("Kiem Tra sinh vien co trong danh sach: " + danhSachSinhVien.kiemTraTonTai(sinhVien));
      } else if (luaChon == 7) {
        /*
         * xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
         */
        System.out.println("Nhap ma sinh vien : ");
        String maSinhVien = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(maSinhVien);
        System.out.println("Xoa sinh vien : " + danhSachSinhVien.xoaSinhVien(sinhVien));
      } else if (luaChon == 8) {
        /*
         * Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím
         */
        System.out.println("Nhap Ho va Ten : ");
        String hoVaTen = scanner.nextLine();
        System.out.println("Ket qua tim kiem : ");
        danhSachSinhVien.timSinhVien(hoVaTen);
      } else if (luaChon == 9) {
        /*
         * Xuất ra danh sách sinh viên có điểm từ thấp tới cao
         */
        danhSachSinhVien.sapXepSinhVienGiamDanTheoDiem();
        danhSachSinhVien.inDanhSachSinhVien();
      } else if (luaChon == 10) {
        /*
         * 10 Lưu danh sách sinh viên xuống tập tin
         */
        System.out.println("Nhap ten file: ");
        String tenFile = scanner.nextLine();
        File file = new File(tenFile);
        danhSachSinhVien.ghiDuLieuXuongFile(file);
      } else if (luaChon == 11) {
        /*
         * Đọc danh sách sinh viên từ tập tin
         */
        System.out.println("Nhap ten file: ");
        String tenFile = scanner.nextLine();
        File file = new File(tenFile);
        danhSachSinhVien.docDuLieuTuFile(file);
      }

    } while (luaChon != 0);
  }
}
