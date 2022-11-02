public class solutions {
    // Print hollow rectangle pattern
    public static void hollow_Rectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int k = 1; k <= c; k++) {
                if (i == 1 || i == r || k == 1 || k == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // inverted and rotated half prymid pattern
    public static void inverted_And_Rotated_Half_prymid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inverted half prymid pattern with number
    public static void inverted_Half_PrymidPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyd's triangle pattern
    public static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // 0-1 pattern

    public static void _0_1_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                if ((i + k) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void butterfly_Pattern(int n) {
        // first half

        // number off lines
        for (int i = 1; i <= n; i++) {
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces-2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half

        // number off lines
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // solid rhombus
    public static void solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // hollow rhombus pattern
    public static void hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    // Diamond Pattern
    public static void diamond_Pattern(int n) {
        //first half
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // inverted_And_Rotated_Half_prymid(4);
        // inverted_Half_PrymidPattern(5);
        // floydTriangle(5);
        // _0_1_Pattern(5);
        // hollow_Rectangle(4, 5);
        // butterfly_Pattern(4);
        // solid_Rhombus(5);
        // hollow_Rhombus(5);
        diamond_Pattern(4);
    }
}