public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("(0, 0)");
        int steps = 0;
        while (Math.abs(x) + Math.abs(y) != Math.abs(r)) {
            double rand = Math.random(); // Part of the maths library and it generates a random number between 0 and 1, 4 ranges { [0. 0.25). [0.25, 0.5), [0.5, 0.75), [0.75, 1]}
            if (rand < 0.25) {
                x += 1; // Move 1 to the right, when the random number is >0, <0.25
            } else if (rand < 0.5) {
                x -= 1; // Move 1 to the left
            } else if (rand < 0.75) {
                y += 1; // Move 1 up
            } else {
                y -= 1; // Move 1 down
            }
            System.out.println("(" + x + ", " + y + ")");
            steps += 1;
        }
        System.out.println("steps = " + steps);
    }
}
