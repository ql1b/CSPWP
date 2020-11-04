/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        x1 = Math.toRadians(x1);
        double y1 = Double.parseDouble(args[1]);
        y1 = Math.toRadians(y1);
        double x2 = Double.parseDouble(args[2]);
        x2 = Math.toRadians(x2);
        double y2 = Double.parseDouble(args[3]);
        y2 = Math.toRadians(y2);
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;
        double inside1 = Math.sin(xDiff / 2.0) * Math.sin(xDiff / 2.0);
        double inside2 = Math.cos(x1) * Math.cos(x2) * Math.sin(yDiff / 2.0) * Math
                .sin(yDiff / 2.0);
        double root = Math.sqrt(inside1 + inside2);
        // mean radius of the Earth
        double R = 6371.0;
        double distance = 2.0 * R * Math.asin(root);
        System.out.println(distance + " kilometers");
    }
}
