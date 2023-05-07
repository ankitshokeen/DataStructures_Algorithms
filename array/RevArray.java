public class RevArray {
    public static void main(String[] args){

     int[] arr = {65,67,54,78,34,76};
     int start = arr[0];
     int end = arr.length-1;

     while(start<end){
        start++;
        end--;
     }
     System.out.println(arr);
    }
}
