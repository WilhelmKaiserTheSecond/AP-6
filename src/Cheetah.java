public class Cheetah extends Mammal implements Hunter{
    private String speciality = "A fast runner";

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Cheetah(String name, int age, int speed, String speciality) {
        super(name, age, speed);
        this.speciality = speciality;
    }
}
