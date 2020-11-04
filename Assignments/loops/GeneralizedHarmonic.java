public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double product = 1;
            if (r >= 0) {
                for (int j = 1; j <= r; j++) {
                    product *= i;
                }
            } else {
                for (int j = 1; j <= Math.abs(r); j++) {
                    product /= i;
                }
            }
            sum = sum + (1 / product);
        }
        System.out.println(sum);
    }
}
