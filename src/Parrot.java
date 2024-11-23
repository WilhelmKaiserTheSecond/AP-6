public class Parrot extends Bird implements Prey{
    public Parrot(String name, int age, int flyheight, String speciality) {
        super(name, age, flyheight);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    private String speciality = "A singer";

}
