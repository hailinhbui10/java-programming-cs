public class HelloGoodbye {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];

        System.out.println("Hello " + name1 + " and " + name2 + ".");
        System.out.println("Goodbye " + name2 + " and " + name1+ ".");
    }

    public static class GeneralizedHarmonic {
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            int r = Integer.parseInt(args[1]);
            double sum = 0.0;
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    sum += (1 / (Math.pow(i, r)));
                }
                System.out.println(sum);
            }
            }
        }

    public static class BandMatrix {
        public static void main(String[] args) {
            /* Parse the agrs into integer values */
            int n = Integer.parseInt(args[0]);
            int width = Integer.parseInt(args[1]);

            /* Check if n and width are non-negative integer */
            if ((width >= 0) && (n >= 0)) {
                for (int verticalIndex = 0; verticalIndex < n; verticalIndex++) {
                    for (int horizontalIndex = 0; horizontalIndex < n; horizontalIndex++) {
                        if (horizontalIndex != 0) System.out.print(" ");
                        if (Math.abs(horizontalIndex - verticalIndex) > width) {
                            System.out.print("0");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
