import java.util.*;

public class Linearsearch2dmaxArray{
    public static void main(String[] args){

        int[][] arr = {
            {36,46,25,75},
            {57,33,88},
            {84,76,35,86}
        };

        System.out.println(max(arr));

    }

    static int max(int[][] arr){
        int maxx=arr[0][0];
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(maxx<arr[row][col]){
                    maxx=arr[row][col];
                }
            }
        }
        return maxx;
    }
}