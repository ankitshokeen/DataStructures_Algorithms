public class AgnosticBS {
    public static void main(String[] args){
        
        int[] nums = {98,87,76,65,54,43,32,21,-12,-23,-34,-45,-56,-67,-78,-89};
        int target = 76;
        int ans = agnosticbs(nums, target);

        System.out.println(ans);
    }
    static int agnosticbs(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        
        boolean find = start < end;
        
        while(nums[start] <= nums[end]){
            int mid = start+(end-start)/2;
            
            if(nums[mid]==target){
                return mid;
            }
                if(find){
                    if(target < nums[mid]){
                        end = mid -1;
                    } else if(target > nums[mid]){
                        start = mid +1;
                    }
                } else{
                    if(target > nums[mid]){
                        end = mid -1;
                    } else if(target < nums[mid]){
                        start = mid +1;
                    }
                }
            }
            return -1;
        }
    }
