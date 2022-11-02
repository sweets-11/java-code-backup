import java.rmi.dgc.VMID;

public class Abstraction_class {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal(); can't create objects of abstract class

        Mustang myHorse = new Mustang();// isse uper ke saare object comment kr kr run krna
        //Animal -> Horse -> Mustang iss heirarchy se call hoga
    }
}


abstract class Animal {//created an abstract class aur innme hum object nahi bna sakte
    Animal() {
        System.out.println("Animal constructor called..");
    }



    void eat() {//first we create non abstract function
        System.out.println("Animal eats");
    }

    abstract void walk();// abstract method, hum iske aankar implimentation nahi likh sakte(like we give in eat() {syso("animal eats")}) jese hum abstract class k andar objects nahi bna sakte // yaha bus idea dia h implementation nahi kia h// uss same idea ho horse ne implement kia h jisme walk() pass hua void type ke sath bina parameter k
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called...");
    }


    void walk() {//Aur abstract method jo bhi thee uski super class, base class, parent class k andar usko hamne yaha impliment kr dia horse class m;
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang() {
        System.out.println("Mustang constructor called..");
    }
}

class Chicken extends Animal {//iske lie bhi hame by definition impliment krna padega walk() abstract method ko';
void walk() {System.out.println("Walks on 2 legs");}
}