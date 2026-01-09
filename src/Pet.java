public class Pet {

    private String name;
    private int hunger;
    private int thirst;
    private int bladder;
    private int hygiene;
    private int happiness;
    private int health;
    private int energy;
 
 
    public Pet(String name) {
        this.name = name;
        hunger = 50;
        thirst = 50;
        bladder = 50;
        hygiene = 50;
        happiness = 50;
        health = 50;
        energy = 50;
    }

    public void idle() {
        //
    }

    public void sound() {
        //
    }

    public void sleep() {
        //
    }

    public void move() {
        //
    }

    public String getName() {
        return name;
    }
    
    public int getHunger() {
        return hunger;
    }
 
    public int getThirst() {
        return thirst;
    }
 
    public int getBladder() {
        return bladder;
    }

    public int getHygiene() {
        return hygiene;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }
 
    public void setName(String newName) {
        name = newName;
    }
 
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
 
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
 
    public void setBladder (int bladder) {
        this.bladder = bladder;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
 }
 
 
 
 
