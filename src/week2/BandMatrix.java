package week2;

public class BandMatrix {
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

