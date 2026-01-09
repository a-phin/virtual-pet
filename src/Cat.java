public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is using its paws trying to get a better view of something.");
    }

    public void sound() {
        System.out.println("Meow!");
    }

    public void sleep() {
        System.out.println(getName() + " is purring in its sleep!");
    }

    public void move() {
        System.out.println("This little cat moves fast!");
    }
}
