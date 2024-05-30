package Buoi20;

public class MayTinhVinaCal500 implements MayTinhBoTuiInterface {

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Loi " + e.getMessage());
            return Double.NaN;
        }
    }

}
