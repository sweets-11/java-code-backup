public class copy_constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aniket";
        s1.roll = 123;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);// hum chahate h ki s1 ki saari properties s2 me copy ho jaae, tho iss k lie ek
        // copy constructor banaege
        s2.password = "xyz";
        s1.marks[2] = 100;// ye change humne s1 me laya h pr s2 me bhi aaega because yaha s1 ke array me jo marks h unka reference aaaya h array nahi aaya
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);// yaha same marks print hoge s1 vaale
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor,,, s1 ki property ko s2 ne copy kr lia
    Student(Student s1) {// yaha parameter me object pass hoga
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

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
