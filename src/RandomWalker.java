public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 1;
        int counter = 0;
        final double PROBABILITY = 0.25;

       /* Print the coordinates of the starting points) */
        System.out.println("(" + x + ", " + y + ")");
        /* Expression: as long as the random walker is not yet at Manhattan distance r from the starting point*/
        while (Math.abs(x) + Math.abs(y) < r) {
            /* create a random number to define the direction*/
            double currentRandom = Math.random();
            /* saved the last rand and keep generating new random values
            avoid Math.random() returns same values in a row*/
            if (currentRandom <= PROBABILITY) {
                x += step;
            }
            else if (currentRandom <= PROBABILITY*2) {
                x -= step;
            }
            else if (currentRandom <= PROBABILITY*3) {
                y += step;
            }
            else
                y -= step;
            counter++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.print("steps = " + counter);
    }
}
