public class Chicken extends Pet {

    public Chicken(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is looking around its own surroundings. ");
    }

    public void sound() {
        System.out.println("Cluck! ");
    }

    public void sleep() {
        System.out.println(getName() + " is roosting high on the roof.");
    }

    public void move() {
        System.out.println(getName() + " is moving around the barn.");
    }
}
