public class MaxArray {
    public static void main(String[] args){
        
        int[] arr = {56,128,76,34,78};
           int max = arr[0];
           
           for(int i=0; i<arr.length; i++){
               if(max<arr[i]){
                   max=arr[i];
               }
           }
           System.out.println(max);
       }
}
