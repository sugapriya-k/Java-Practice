
public class armstrong {

    public static void main(String[] args) {
        int x = 153;
            System.out.println(Armstrong(x));


    }

   public static boolean Armstrong(int x){
    int original=x;
    int result=0;
    int count=countdigit(x);
    while(x!=0){
        int digit=x%10;
        result+= (int)Math.pow(digit,count);
        x/=10;

    }
    return (original==result);

   }
   public static int countdigit(int x){
    if (x==0) {
        return 0;
    }

    int count=0;

    while(x!=0){
        count++;
        x/=10;
    }return count;
   }
}
