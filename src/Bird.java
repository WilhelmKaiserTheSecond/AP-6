public abstract class Bird extends Animal{
    private int flyheight;

    public int getFlyheight() {
        return flyheight;
    }

    public void setFlyheight(int flyheight) {
        this.flyheight = flyheight;
    }

    public Bird(String name, int age, int flyheight) {
        super(name, age);
        this.flyheight = flyheight;
    }
}
