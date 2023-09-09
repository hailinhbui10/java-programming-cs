package week1;

public class GreatCircle {
    public static void main(String[] args) {
        // parse the input (in degree) to double type
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);

        // convert the value to radians
        double x1 = Math.toRadians(a);
        double y1 = Math.toRadians(b);
        double x2 = Math.toRadians(c);
        double y2 = Math.toRadians(d);

        double r = 6371.0;

        double result = 2.0 * r * Math.asin(
                Math.sqrt(
                        Math.pow(Math.sin((x2 - x1)/2.0), 2)
                        + Math.cos(x1)*Math.cos(x2)*Math.pow((Math.sin((y2 - y1)/2.0)), 2)));

        System.out.println(result + " kilometers");
    }
}
