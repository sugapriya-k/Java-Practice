public class CountEvenDigit {
    public static void main(String[] args) {
        System.out.println("Program started");
        int a=24682648;
        int count=0;
        while(a!=0){
            if(a%2==0){
                count++;
               
            }
            a/=10;
            
        }
        System.out.println(count);
    }
}
