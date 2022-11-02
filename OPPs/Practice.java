public class Practice{
    public static void main(String[] args) {
        Student stu = new Student();// created a new object;
        stu.setName("Aniket Jain");
        stu.setAge(19);
        stu.setPercentage(90, 50, 60);
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println(stu.percentage);
        stu.hobbles="Anime";
        System.out.println(stu.hobbles);
    }

}

class Student{
    String name;
    String subjects;
    float percentage;
    int age;
    String hobbles;

    void setName(String newName){
        name = newName;
    }

    // void setSub(String newSub){
    //     subject = newSub;
    // }

    void setAge(int Age){
        age = Age;
    }

    void setPercentage(int Account, int Business, int Economics){
        percentage = (Account + Business + Economics)/3;
    }
}