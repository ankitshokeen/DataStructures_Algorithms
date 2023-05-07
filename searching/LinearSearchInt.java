public class LinearSearchInt {
    public static void main(String[] args){
        
        int[] nums = {34,65,67,87,54,32,45,63};
        int target = 54;
        int ans = Search(nums,target);
        System.out.println(ans);
        
    }
    static int Search(int[] arr, int target){
           if(arr.length==0){
               return -1;
           }
        for(int index=0; index<arr.length; index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
