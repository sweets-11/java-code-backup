public class Binary_string {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n - 1, 0, str + "0");//if wee want consecutive 0 then here replace str"0" by 1
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");//if wee want consecutive 0 then here replace str"1" by 0
        }
    }

    public static void main(String[] args) {
        printBinStrings(3, 0, "");

    }
}