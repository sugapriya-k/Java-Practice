public class Prime{
    public static void main(String[] args) {
        int x=35;
        System.out.println(isPrime(x));
    }
    public static boolean isPrime(int x){
        if(x<2) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0)
            return false;
        }
        return true;
    }
}