package TestCase10;

public class Main {
    public static void main(String[] args) {
        try {
            SachGiaoKhoa sachGiaoKhoa1 = new SachGiaoKhoa("H001", "10-10-2003", 60000, 10, "NXB Giao Duc", "moi");
            SachGiaoKhoa sachGiaoKhoa2 = new SachGiaoKhoa("St01", "01-01-2023", 50000, 90, "NXB Tuoi Tre", "cu");
            System.out.println(" Thanh tien sach giao khoa 1 : " + sachGiaoKhoa1.thanhTien());
            System.out.println("Thanh tien sach giao khoa 2 : " + sachGiaoKhoa2.thanhTien());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
