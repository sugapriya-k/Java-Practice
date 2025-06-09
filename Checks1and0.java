
public class Checks1and0 {

    public static void main(String[] args) {
        int x = 11001;
        boolean flag = true;

        while (x != 0) {
            int lastdigit = x % 10;
            if (lastdigit != 0 && lastdigit != 1) {
                flag = false;
                break;
            }
            x /= 10;
        }

        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean palindrome(int x){
        

    }
}
