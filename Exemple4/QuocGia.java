package Exemple4;

public class QuocGia {
    private String maQuocGia, tenQUocGia;

    // constructor
    public QuocGia(String maQuocGia, String tenQUocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQUocGia = tenQUocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public String getTenQUocGia() {
        return tenQUocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public void setTenQUocGia(String tenQUocGia) {
        this.tenQUocGia = tenQUocGia;
    }

}
