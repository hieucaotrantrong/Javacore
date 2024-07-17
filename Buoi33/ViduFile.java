package Buoi33;

/*
 * Cacsh lấy thông tin cơ bản của tập tin và duyệt cây thư mục trong java
 */
import java.io.File;
import java.util.Scanner;

public class ViduFile {
    File file;

    public ViduFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThu() {
        /*
         * Kiểm tra file có thể thực thi
         */
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        /*
         * Kiểm tra file có thể đọc
         */
        return this.file.canRead();
    }

    public boolean kiemTraGhi() {
        /*
         * Kiểm tra file có thể ghi
         */
        return this.file.canWrite();
    }

    public void inDuongDan() {
        /*
         * In ra đường dẫn của file
         */
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen() {
        /*
         * In ra tên file
         */
        System.out.println(this.file.getName());
    }

    public void kiemTraThuMucHoacTapTin() {
        /*
         * Kiểm tra tập tin hoặc thư mục
         */
        if (this.file.isDirectory()) {
            System.out.println("Day la thu muc: ");
        } else if (this.file.isFile()) {
            System.out.println("Day la tap tin: ");
        }
    }

    public void inDanhSachCacFileCon() {
        /*
         * In ra danh sách cac file con
         */
        if (this.file.isDirectory()) {
            System.out.println("Cac tap tin con/thu muc con la: ");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("Day la tap tin , khong co du lieu ben trong: ");
        }
    }

    public void inCayThuMuc() {
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public void inChiTietCayThuMuc(File file, int bac) {
        // System.out.println("|");
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");

        }
        System.out.print("|__");
        System.out.println(file.getName());
        if (file.canRead() && file.isDirectory()) {
            File[] mangCon = file.listFiles();
            for (File file2 : mangCon) {
                inChiTietCayThuMuc(file2, bac + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("Nhap ten file:");
        String tenFile = scanner.nextLine();
        ViduFile viduFile = new ViduFile(tenFile);
        do {
            System.out.println("*MENU*");
            System.out.println("1.Kiem tra file co the thuc thi: ");
            System.out.println("2.Kiem tra file co the doc: ");
            System.out.println("3.Kiem tra file co the ghi: ");
            System.out.println("4.In duong dan : ");
            System.out.println("5.In ten file: ");
            System.out.println("6.Kiem tra file la thu muc hoac tap tin: ");
            System.out.println("7.In ra danh sach file con: ");
            System.out.println("8.In ra cay thu muc: ");
            System.out.println("0.Thoat ra khoi chuong trinh. ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println(viduFile.kiemTraThucThu());
                    break;
                case 2:
                    System.out.println(viduFile.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(viduFile.kiemTraGhi());
                case 4:
                    viduFile.inDuongDan();
                    break;
                case 5:
                    viduFile.inTen();
                    break;
                case 6:
                    viduFile.kiemTraThuMucHoacTapTin();
                    break;
                case 7:
                    viduFile.inDanhSachCacFileCon();
                    break;
                case 8:
                    viduFile.inCayThuMuc();
                    break;
                default:
                    break;
            }
            scanner.nextLine();
        } while (luaChon != 0);
    }
}