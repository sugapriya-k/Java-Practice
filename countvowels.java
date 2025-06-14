import java.lang.String;

public class countvowels {
    public static void main(String[] args) {
        String s="saThishkumar";
        s=s.toLowerCase();
        int count =0;
        for(char c: s.toCharArray()){
            if("aeiou".indexOf(c) != -1)
          
            count++;
        }
        System.out.println(count);
    }
}
