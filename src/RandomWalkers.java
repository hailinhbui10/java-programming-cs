public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int sum = 0;

        for (int i = 0; i < trials; i++) {
            int counter = 0;
            int x = 0;
            int y = 0;
            int step = 1;
            final double PROBABILITY = 0.25;
//            double previousRandom = 0.0;
            /* Expression: as long as the random walker is not yet at Manhattan distance r from the starting point*/
            while (Math.abs(x) + Math.abs(y) < r) {
                /* create a random number to define the direction*/
                double currentRandom = Math.random();
                /* saved the last rand to avoid Math.random() returns same values in a row*/
//                double currentRandom;
//                do {
//                    currentRandom = Math.random();
//                } while (currentRandom == previousRandom);
//                previousRandom = currentRandom;

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
            }
            sum += counter;
        }
        double avgNoOfSteps = sum / (double) trials;
        System.out.print("average number of steps = " + avgNoOfSteps);
    }
}
