package Day12;

public class TestAnimals {
    public static void main(String[] args) {

        Parrot parrot = new Parrot("Parrot");
        parrot.fly();
        parrot.makeSound();
        System.out.println();
        Dog dog = new Dog("dog","180cm","German Shepherd");
        dog.makeSound();
        dog.Breastfeed();
        System.out.println();
        Cat cat = new Cat("cat","Siamese");
        cat.makeSound();
        cat.Breastfeed();
    }
}
