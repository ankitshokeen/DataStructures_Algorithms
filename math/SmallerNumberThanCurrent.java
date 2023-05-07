import java.util.*;
public class SmallerNumberThanCurrent {
    public static void main(String[] args){

        int[] arr = {8,1,1,2,2,3};

        System.out.println(Arrays.toString(min(arr)));
    }
    static int[] min(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}