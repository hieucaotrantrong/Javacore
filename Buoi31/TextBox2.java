package Buoi31;

/*
 * Tìm hiểu generric trong java
 */
public class TextBox2 {
    public static void main(String[] args) {
        Box2 box2 = new Box2<Integer>(15);
        System.out.println("Gia tri: " + box2.getValue());
        Box2 box22 = new Box2<String>("Cao Hieu");
        System.out.println("Gia tri: " + box22.getValue());

    }
}
