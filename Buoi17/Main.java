package Buoi17;

public class Main {
    // Ghì đè phương thức
    public static void main(String[] args) {

        System.out.println("----Test dog---");
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
        dog.sleep();

        System.out.println("--- Test Cat---");
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        System.out.println("----Test bird---");
        Bird bird = new Bird();
        bird.eat();
        bird.makeSound();
        bird.sleep();
    }
}
