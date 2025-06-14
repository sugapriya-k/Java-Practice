public class String{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
    
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                System.out.println("");
            }
        }

    }
}