
public class reverse {

    public static void main(String[] args) {
        int x = 12345;

        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        System.out.println(reverse);
    }
}
