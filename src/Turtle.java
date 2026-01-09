public class Turtle extends Pet {

    public Turtle(String name) {
        super(name);
    }

    public void idle() {
        System.out.println(getName() + " is enjoying the sun rays from here!");
    }

    public void sound() {
        int effect = (int) ((Math.random()*3) + 1);
        if (effect == 1)
            System.out.println("Hiss!");
        else if (effect == 2)
            System.out.println("Grunt!");
    }

    public void sleep() {
        System.out.println("You can only see the turtle's shell from here.");
    }

    public void move() {
        int effect = (int) ((Math.random()*3) + 1);
        if (effect == 1)
            System.out.println(getName() + " is swimming in the waters!");
        else if (effect == 2)
            System.out.println(getName() + " is walking on land!");
    }
}
