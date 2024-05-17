package Buoi17;

public class Cat extends Animal {
    // Ghì đè phương thức
    public Cat() {
        super("Meo");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("Toi an ca");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        super.makeSound();
        System.out.println("Toi keu meo meo");
    }

}
