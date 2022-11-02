public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Aniket");// Student object created
        System.out.println(s1.name);

        Studen s2 = new Studen();
    }
}

class Student {
    String name;
    int roll;

    Student(String name) {// student Constructor created
        // even if we did not create a constructor java will create a constructor by it
        // self we can't intialisation any thing like String name
        this.name = name;
    }
}

class Studen {
    String name;

    Studen() {// if we just wanna print something, without passing an argument
        System.out.println("Constructor is called....");
    }
}