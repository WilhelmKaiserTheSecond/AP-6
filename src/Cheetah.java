public class Cheetah extends Mammal implements Hunter{
    private String speciality;

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
    public void hunt(Animal animal) {
        System.out.println("cheetah hunted" + animal);
    }

    @Override
    public String toString() {
        return super.toString() + "'Speciality' = " + speciality + "'}'";
    }
}
