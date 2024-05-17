package Buoi17;

public class Dog extends Animal {
    // Ghì đè phương thức
    public Dog() {
        super("Cho");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println("Toi an suong");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        super.makeSound();
        System.out.println(" Toi dang sua gau gau");
    }

}