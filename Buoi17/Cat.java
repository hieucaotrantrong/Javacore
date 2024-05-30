package Buoi17;

public class Cat extends Animal {
    // Ghì đè phương thức
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
