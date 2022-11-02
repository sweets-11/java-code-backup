public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JVM";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";// again declare kia schoolName "ABC" tho saare object k lie schoolName ABC ho jaaega , aur future me firse declare kia s4 bna kr tho pehele "JVM" tha fir "ABC" hua aur "CVB" ye jo bhi hm likhe ge
    }
}




class Student {
    static int returnPercentage(int math, int phy, int chem){// isko bhi static keyword k sath declare kr sakte h as iss function ka logic change nahi hoga hr kisi k lie tho Student class k andar returnPercentage ek hi baar create hoga
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}