public class multi_level_inheeritance {
    public static void main(String[] args) {
        Dog dobby  = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.breed = "lepord";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
    }
}


// Base class
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}


class Mammal extends Animals{
    int legs;
}

class Dog extends Mammal {
    String breed;
}