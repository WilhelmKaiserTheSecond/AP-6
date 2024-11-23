public class Girafe extends Mammal implements Prey{
    private String speciality = "Really tall";

    public Girafe(String name, int age, int speed, String speciality) {
        super(name, age, speed);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
