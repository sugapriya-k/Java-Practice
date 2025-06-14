public class largestelementinarray {
    public static void main(String[] args) {
        int a[]={3,4,5,2,6,1,10,9,7};
        int max=a[0];
        for(int i=0;i<=a.length-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
         System.out.println(max);
    }
}
