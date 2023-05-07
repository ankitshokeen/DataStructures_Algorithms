import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args){

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer>list = new ArrayList<Integer>();

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);

        System.out.println(list);
    }
}
