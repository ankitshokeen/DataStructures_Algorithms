public class BinarySearch{
    public static void main(String[] args){
        
        int[] nums = {-98,-54,-12,12,23,34,56,78,89,109};
        int target = 78;
        int ans = binarysearch(nums,target);
        
        System.out.println(ans);
    }
    static int binarysearch(int[] nums, int target){
        int start = 0;
        int end = nums.length;
        
        while(start<=end){
            int mid = start+(start-end)/2;
        if(target < nums[mid]){
            end = mid -1;
        } else if(target > nums[mid]){
            start = mid +1;
        } else {
            return mid;
        }
        }
        return -1;
    }
}