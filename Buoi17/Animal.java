package Buoi17;

public class Animal {
    protected String name;

    /*
     * ghi đè phương thức trong java
     */
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Toi dang an......");
    }

    public void makeSound() {
        System.out.println("Toi dang tao ra am thanh...");

    }

    public void sleep() {
        System.out.println("Toi dang ngu...");
    }
}
