public class CountTheDigit {
    public static void main(String[] args) {
        int x=995489213;
        System.out.println(count(x));
        System.out.println(Numoftimes(x));
    }
    public static int count(int n){
        if(n==0) return 0;
        int count=0;
        while(n!=0){
            count++;
           n/=10;
        }
         return count;
    }
    public static int Numoftimes(int n){
        int count=0;
        while(n!=0){
            int digit=n%10;
            if(digit==9)
              count++;
            n/=10;
        }
        return count;
    }
    
}
