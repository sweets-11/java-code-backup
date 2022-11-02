public class shallow_deep_copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.roll = 123;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {// iss baar s2 k marks change nahi hogi is baar
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor,,, s1 ki property ko s2 ne copy kr lia
    // Student(Student s1) {// yaha parameter me object pass hoga
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;

    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {// non-parameterized
        marks = new int[3];
        System.out.println("constructor is called....");
    }

    Student(String name) {// parameterized
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {// parameterized
        marks = new int[3];
        this.roll = roll;
    }

}
