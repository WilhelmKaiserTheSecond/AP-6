import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eagle eagle = new Eagle("eagle", 4 , 11000 , "Fly's High");
        Parrot parrot = new Parrot("kalagh" , 1 , 1000 , "Sings");
        Cheetah cheetah = new Cheetah("gholam" , 3 , 80 , "fast");
        Girafe girafe = new Girafe("mostafa" , 3 , 40 , "Tall");
        System.out.println(girafe);
        System.out.println(eagle);
        eagle.hunt(parrot);
    }
}