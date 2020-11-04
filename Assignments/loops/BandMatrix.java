public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 1; j <= n; j++) {
                if (((j - i) * (j - i)) <= (width * width)) {
                    row = row + "*  ";
                } else {
                    row = row + "0  ";
                }
            }
            System.out.println(row);
        }
    }
}
