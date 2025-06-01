package Day12;

public  class Cat extends Mammal {

    private String race;

    public Cat(String name, String race) {
        super(name);
        this.race = race;
    }


    public void Breastfeed() {
        System.out.println("cat is Breastfeeding");
    }

    public void makeSound() {
        System.out.println("cat is Making Sound");
    }
}
