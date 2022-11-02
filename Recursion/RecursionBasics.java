public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {// 3 step define a base case taaki recursive function 10 to 1 pr jaakr ruk jaae
                     // ,agar humne ye define nahi kia tho tho error aajata because compiler ko pata
                     // hi nahi hota ki kha jaa kr rukna n.
            System.out.println(n);
            return;
        }
        System.out.println(n);// 1 step sabse pehele n ko print kra do
        printDec(n - 1);// 2 step apne inner function ko call lagana n-1 ke lie aur hum ye bharosa
                        // rakhege kii ye hame saare kaam krkr dedega;
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);

        System.out.println(n);
    }


    public static int factorial(int f) {
        if(f == 0) {
            return 1;
        }

        int fnm1 = factorial(f -1);
        // int fn = f * factorial(f - 1);
        int fn = f * fnm1;
        return fn;


    }

    public static int calCsum(int n) {
        if(n == 1) {
            return 1;
        }

        int fnm1 = calCsum(n - 1);
        int fn = n + fnm1;
        return fn;


    }
    public static void main(String[] args) {
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // int f = 5;
    //    System.out.println( factorial(f));
    int n = 4;
    System.out.println(calCsum(n));
    }
}