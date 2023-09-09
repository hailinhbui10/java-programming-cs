package week1;

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // check if all side lengths are positive
        boolean firstCondition = (a > 0) && (b > 0) && (c > 0);

        // avoid arithmetic overflow (too big for an Int)
        boolean extraCondition = (Math.pow(a, 2) < Math.pow(2, 32))
                && (Math.pow(b, 2) < Math.pow(2, 32))
                && (Math.pow(c, 2) < Math.pow(2, 32));

        // check if the sum of the squares of two of the integers equals the square of the third integer
        boolean secondCondition =
                (Math.pow(a, 2)  + Math.pow(b, 2)  == Math.pow(c, 2) ) ||
                (Math.pow(a, 2)  + Math.pow(c, 2) == Math.pow(b, 2)) ||
                (Math.pow(b, 2)) + Math.pow(c, 2) == Math.pow(a, 2) ;
        System.out.println(firstCondition && extraCondition && secondCondition);
    }
}
