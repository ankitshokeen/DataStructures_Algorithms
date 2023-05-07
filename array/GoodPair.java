public class GoodPair {
    public static void main(String[] args){

        int[] nums = {1,2,3,1,1,3};

        System.out.println(pair(nums));
    }
    static int pair(int[] nums){
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}
