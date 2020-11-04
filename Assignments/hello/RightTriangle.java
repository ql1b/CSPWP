/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        boolean isRightTriangle;
        boolean allPositive;
        boolean isTriple;
        isTriple = (a2 == (b2 + c2)) || (b2 == (a2 + c2)) || (c2 == (a2 + b2));
        allPositive = (a > 0) && (b > 0) && (c > 0);
        isRightTriangle = allPositive && isTriple;
        System.out.println(isRightTriangle);
    }
}
