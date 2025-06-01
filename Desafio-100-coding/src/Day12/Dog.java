package Day12;

public class Dog extends Mammal{

    private String size;
    private String race;

    public Dog(String name, String size, String race) {
        super(name);
        this.size = size;
        this.race = race;
    }


    public void Breastfeed() {
        System.out.println("dog is Breastfeeding");
    }

    public void makeSound() {
        System.out.println("dog is Making Sound");
    }
}
