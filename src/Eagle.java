public class Eagle extends Bird implements Hunter{
    private String speciality;

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

    @Override
    public void hunt(Animal animal) {
        System.out.println("eagle hunted" + animal);
    }

    @Override
    public String toString() {
        return super.toString() + "'Speciality' = " + speciality + "'}'";
    }
}
