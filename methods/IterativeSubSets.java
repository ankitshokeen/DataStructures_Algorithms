import java.util.ArrayList;
import java.util.List;

public class IterativeSubSets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //System.out.println(SubSets(arr));
        System.out.println(DuplicateNoSubSets(arr));
    }
    static List<List<Integer>> SubSets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> DuplicateNoSubSets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i=0; i<arr.length; i++){
            start = 0;
            // if current element or pervious elements are same, start = end +1
            if (i>0 && arr[i] == arr[i-1]){
                start = end +1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for (int j=0; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}