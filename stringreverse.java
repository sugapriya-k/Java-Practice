
import java.lang.String;
public class stringreverse {
    public static void main(String[] args) {
        System.out.println(isPalindrome("rcar"));
        String s="appa";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
                System.out.println(reverse);
                System.out.println(s);
        if (reverse.equals(s)) {
            System.out.println("true");
        }

    }
    public static boolean isPalindrome(String str) {
       int i=0 ,j=str.length()-1;
       while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}
