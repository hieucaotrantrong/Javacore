package Exemple2;

public class Ngay {
    // Attributes
    private int Ngay, thang, nam;
    // constructor

    public Ngay(int ngay, int thang, int nam) {
        this.Ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return Ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        Ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

}
