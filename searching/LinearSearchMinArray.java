public class LinearSearchMinArray {
    public static void main(String[] args){
        int[] nums = {34,75,39,77,2,78,1,99};
        System.out.println(Val(nums));
    }
    static int Val(int[] arr){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
