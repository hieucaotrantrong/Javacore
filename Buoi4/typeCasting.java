package Buoi4;

public class typeCasting {
    // ép kiểu trong java
    public static void main(String[] args) {
        int a = 100;
        int b = 2;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        // ép kiểu ngầm định
        float c = a;
        float d = b;
        System.out.println("c=:" + c);
        System.out.println("d=:" + d);
        // em kiểu tường minh
        float e = 3.5f;
        float f = 9.5f;
        System.out.println("e=:" + e);
        System.out.println("f=:" + f);

        int g = (int) e;
        int h = (int) f;
        System.out.println("g=:" + g);
        System.out.println("h=:" + h);
    }
}
