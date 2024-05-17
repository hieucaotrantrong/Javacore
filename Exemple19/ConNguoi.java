package Exemple19;

public class ConNguoi {
    protected String hoVaten;
    protected int namSinh;

    public ConNguoi(String hoVaten, int namSinh) {
        this.hoVaten = hoVaten;
        this.namSinh = namSinh;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void an() {
        System.out.println("Con nguoi an");
    }

    public void ngu() {
        System.out.println("COn Nguoi ngu");
    }
}
