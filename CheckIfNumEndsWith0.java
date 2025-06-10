public class CheckIfNumEndsWith0 {
    public static void main(String[] args) {
        int a=12350;
        boolean flag=false;
     
            int last = a%10;
            if(last==0){
                System.out.println("Yes it ends with zero");
            }else{
                System.out.println("Not ends with zero");
            
        }
    }
}
