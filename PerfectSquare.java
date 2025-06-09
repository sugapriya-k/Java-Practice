
public class PerfectSquare {

    public static void main(String[] args) {
        int x = 1571;
        System.out.println(isperfect(x));
        System.out.println(LargestDigit(x));
    }

    public static boolean isperfect(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static int LargestDigit(int x) {
        int max = Integer.MIN_VALUE;
        while (x != 0) {
            int digit = x % 10;
            if (digit > max) {
                max = digit;

            }
            x/=10;
        }
        return max;

    }
}
