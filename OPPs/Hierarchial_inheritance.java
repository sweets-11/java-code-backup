public class Hierarchial_inheritance {
    public static void main(String[] args) {
        // yaha hum mammal , fish, bird kisi ka bhi object banaege tho un sabme hum animal class ki property use kr paaege
        Bird crow = new Bird();
        crow.color = "Black";
        crow.breathe();
        System.out.println(crow.color);
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
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animals{
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animals{
    void fly() {
        System.out.println("fly");
    }
}