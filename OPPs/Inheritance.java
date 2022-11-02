
public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        System.out.println();
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

// Derived class
class Fish extends Animals {// extends keyword animals ki saari property aur function leleta he
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}