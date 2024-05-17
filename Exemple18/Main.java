package Exemple18;

public class Main {
    // ke thua thu bac
    public static void main(String[] args) {
        Dog dog = new Dog(null);
        dog.eat();
        dog.bark();

        Cat cat = new Cat(null);
        cat.eat();
        cat.meow();

        Bird bird = new Bird(null);
        bird.eat();
        bird.fly();
    }

}
