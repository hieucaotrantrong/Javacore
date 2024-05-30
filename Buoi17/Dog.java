package Buoi17;

public class Dog extends Animal {
    // Ghì đè phương thức
    public Dog() {
        super("Cho");
    }

    @Override
    public void eat() {
        System.out.println("Toi an suong");
    }

    @Override
    public void makeSound() {

        System.out.println(" Toi dang sua gau gau");
    }

}