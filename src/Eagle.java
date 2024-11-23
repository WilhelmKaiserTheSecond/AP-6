public class Eagle extends Bird implements Hunter{
    private String speciality = "Flys high";

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Eagle(String name, int age, int flyheight, String speciality) {
        super(name, age, flyheight);
        this.speciality = speciality;
    }
}
