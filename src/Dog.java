public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is waiting for you while wagging its tail!");
    }

    public void sound() {
        int effect = (int) ((Math.random()*4) + 1);
        if (effect == 1)
            System.out.println("Woof!");
        else if (effect == 2)
            System.out.println("Arf!");
        else if (effect == 3)
            System.out.println("Bark!");
    }

    public void sleep() {
        System.out.println(getName() + " is loudly snoring in its dreams.");
    }

    public void move() {
        System.out.println(getName() + " is happily running around the barn.");
    }

}
