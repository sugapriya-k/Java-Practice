
public class primenum {

    public static void main(String[] args) {
        int n = 78;
         boolean isPrime = true;

    if(n <= 1) {
        isPrime = false;
    } else {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    System.out.println(isPrime);

}
}
