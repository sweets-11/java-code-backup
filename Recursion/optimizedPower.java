public class optimizedPower {
    public static int optimizedPower (int a, int n){
        //O(logn)
        if(n == 0) {// base case
            return 1;
        }
        // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);    here time complexity is also O(n) as it has tho run same function 2 times in stack,, it's better to take is square.
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
         // n is odd
         if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
         }

         return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));
    }
}