public class Method_overloading {
    public static void main(String[] args) {
        Claculator calc = new Claculator();
        System.out.println(calc.sum(2, 5));// ye call krega last comment ko
        System.out.println(calc.sum(2.5f, 5.5f));
        // System.out.println(calc.sum((float)2.5, (float)5.5)); Type casting.
        System.out.println(calc.sum(2, 5, 5));
    }
}

class Claculator {// isse compile time polymorphish isslie bolte h because isse comple time pr hi pata hota h kab konsa function call krna h like first comment
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
