public class Horse extends Pet {

    public Horse(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is currently resting standing up.");
    }

    public void sound() {
        System.out.println("Neigh!");
    }

    public void sleep() {
        System.out.println(getName() + " is lying down and relaxing its muscles.");
    }

    public void move() {
        System.out.println(getName() + " is galloping around the barn.");
    }

}
