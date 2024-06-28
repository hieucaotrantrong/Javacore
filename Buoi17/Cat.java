package Buoi17;

public class Cat extends Animal {
    /*
     * ghi đè phương thức trong java
     */
    public Cat() {
        super("Meo");
    }

    @Override
    public void eat() {
        System.out.println("Toi an ca");
    }

    @Override
    public void makeSound() {
        System.out.println("Toi keu meo meo");
    }

}
