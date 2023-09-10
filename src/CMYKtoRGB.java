public class CMYKtoRGB {
    public static void main(String[] args) {
        /*parse the args of string to value of double*/
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        /* compute the corresponding RGB values*/
        double white = 1 -  black;
        double red = 255 * white * (1 -  cyan);
        double green = 255 * white * (1 -  magenta);
        double blue = 255 * white * (1 -  yellow);

        /*print the RGB values, each rounded to the nearest integer*/
        System.out.println("red = " + (int) Math.round(red));
        System.out.println("green = " + (int) Math.round(green));
        System.out.println("blue = " + (int) Math.round(blue));
    }
}
