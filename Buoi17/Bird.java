package Buoi17;

public class Bird extends Animal {
    // Ghì đè phương thức
    public Bird() {
        super("Chim");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("Toi dang an con sau");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        super.makeSound();
        System.out.println("Toi dang hot liu lo");
    }

}
