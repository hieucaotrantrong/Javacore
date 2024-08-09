package Buoi39;

/*
 * Bài 74 Cách đọc đối tượng từ tập tin
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    /*
     * Thêm sinh viên vào danh sách
     */
    public void themSinhVien(SinhVien sinhVien) {
        this.danhSach.add(sinhVien);
    }

    /*
     * In danh sách sinh viên ra màn hình
     */
    public void inDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    /*
     * Kiểm tra danh sách sinh viên có rỗng hay không
     */
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    /*
     * Lấy ra số lượng sinh viên trong danh sách
     */
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    /*
     * Làm rỗng danh sách sinh viên
     */
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    /*
     * Kiểm tra sinh viên có tồn tại trong danh sách hay không
     */
    public boolean kiemTraTonTai(SinhVien sinhVien) {
        return this.danhSach.contains(sinhVien);
    }

    /*
     * Xóa 1 xinh viên ra khỏi danh sách dựa trên mã sinh viên
     */
    // Phương thức sai chờ xử lí
    public boolean xoaSinhVien(SinhVien sinhVien) {
        return this.danhSach.remove(sinhVien);
    }

    /*
     * Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
     */
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    /*
     * Xuất ra danh sách sinh viên có điểm từ cao tới thấp
     */
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien sinhVien1, SinhVien sinhVien2) {
                if (sinhVien1.getDiemTrungBinh() < sinhVien2.getDiemTrungBinh()) {
                    return 1;
                } else if (sinhVien1.getDiemTrungBinh() > sinhVien2.getDiemTrungBinh()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });
    }

    /*
     * 10 Ghi du lieu xuong file
     */
    public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            for (SinhVien sinhVien : danhSach) {
                objectOutputStream.writeObject(sinhVien);
            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * |-------------------------------
     * Đọc dữ liệu xuống file
     * |-------------------------------
     */
    public void docDuLieuTuFile(File file) {
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            SinhVien sinhVien = null;
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    break;
                }
                if (object != null) {
                    sinhVien = (SinhVien) object;
                    this.danhSach.add(sinhVien);
                }
            }
            objectInputStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
