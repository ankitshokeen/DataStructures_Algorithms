public class EvenDigits {
    public static void main(String[] args){

        int[] nums = {12,345,2,6,7896};

    }
    static int even(int[] nums){
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int digits = 0;
            while(nums[i]>0){
                nums[i]/=10;
                digits++;
            }
            if(digits%2==0){
                ans++;
        }
        }
        return ans;
    }
}
