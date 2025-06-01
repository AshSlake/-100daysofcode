package Day12;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Parrot is Making Sound");
    }

    public void fly() {
       System.out.println("Parrot is flying");
    }


}
