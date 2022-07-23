class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String species;

    public Dog(String name, String species) {
        super(name);
        this.species = species;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("pupper", "chiwawa");
        System.out.println(d.species);
    }
}
