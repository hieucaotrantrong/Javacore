package Buoi25;

public class ThoiKhoaBieu {
    private Day thu;
    private String cacMonHoc;

    public ThoiKhoaBieu(Day thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Day getThu() {
        return thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "Thu = " + thu + ",Cac mon hoc=" + cacMonHoc;
    }

}
