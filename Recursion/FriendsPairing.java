public class FriendsPairing {

    public static int friendPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        //cchoice
        //single
        int fnm1 = friendPair(n-1);

        //pair
         int fnm2= friendPair(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totWays = fnm1 + pairWays;
        return totWays;

        // return friendPair(n-1) + (n-1) * friendPair(n-2);  very short code for the same
    }

    public static void main(String[] args) {
        System.out.println(friendPair(5));
    }
}
