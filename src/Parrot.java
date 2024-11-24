public class Parrot extends Bird implements Prey{
    private String speciality;
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
    @Override
    public String toString() {
        return super.toString() + "'Speciality' = " + speciality + "'}'";
    }
}
