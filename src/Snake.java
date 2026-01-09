public class Snake extends Pet {

    public Snake(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is scoping to get a better view!");
    }

    public void sound() {
        System.out.println("Hiss!");
    }

    public void sleep() {
        System.out.println(getName() + " is currently sleeping in a motionless state.");
    }

    public void move() {
        System.out.println(getName() + " is slithering around in the grass!");
    }
}
