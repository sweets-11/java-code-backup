public class bonus {
    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // palen
    public static void palindromicPattern_with_Nums(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // asscending

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        numberPyramid(5);
        palindromicPattern_with_Nums(5);
    }
}
