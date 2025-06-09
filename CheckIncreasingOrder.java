
public class CheckIncreasingOrder {

    public static void main(String[] args) {
        int x = 1234;
        System.out.println(isIncreasing(x));

    }

    public static boolean isIncreasing(int x) {
        int previous = x % 10;
        x /= 10;

        while (x != 0) {
            int current = x % 10;
            if (current == previous) {
                return false;
            }

            if (current > previous) {
                return false;
            }
            previous = current;
            x /= 10;
        }
        return true;
    }

}
