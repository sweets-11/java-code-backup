public class solutions {
    // star pattern
    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inverted star pattern
    public static void inverted_Star_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // half prymid pattern
    public static void half_Prymid_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // character pattern

    public static void characterPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // starPattern(4);
        // inverted_Star_Pattern(4);
        // half_Prymid_Pattern(4);
        characterPattern(4);
    }
}