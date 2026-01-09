public class Duck extends Pet {

    public Duck(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is peacefully resting in the waters.");
    }

    public void sound() {
        System.out.println("Quack! ");
    }

    public void sleep() {
        System.out.println(getName() + " is roosting high on the roof.");
    }

    public void move() {
        System.out.println(getName() + " walked up to the lemonade stand and he said to the man, runnin' the stand:");
    }
}
