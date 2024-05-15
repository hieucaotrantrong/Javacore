package Buoi16;

public class ConNguoi {
    private String hoVaten;
    private int namSinh;

    // constructor
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
        System.out.println("AN");
    }

    public void uong() {
        System.out.println("Uong :");
    }

    public void ngu() {
        System.out.println("Ngu :");
    }
}
