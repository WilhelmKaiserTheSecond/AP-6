public abstract class Mammal extends Animal{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Mammal(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +"speed = " + speed;
    }
}
