import java.util.*;

public class LinearSearch2D {
    public static void main(String[] args){
        
        int[][] nums = {
            {54,53,68,58},
            {76,48,33},
            {22,66,89,99}
        };
        int target = 99;
        int[] ans = Search(nums, target);
        
        System.out.println(Arrays.toString(ans));
        
    }
    
    static int[] Search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
