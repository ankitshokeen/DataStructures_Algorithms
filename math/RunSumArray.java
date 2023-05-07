public class RunSumArray {
    public static void main(String[] args){
        
        int[] arr = {56,87,45,78,54,34,56};
           int sum = 0;
           
           for(int i=0; i<arr.length; i++){
               sum=sum+arr[i];
               System.out.println(sum);
           }
       }
}
