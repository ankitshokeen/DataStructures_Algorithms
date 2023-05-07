import java.util.ArrayList;
import java.util.List;

public class RecursiveLinearSearch{
    public static void main(String[] args) {
        //int[] arr = {34, 85, 25, 75, 25, 45, 79, 25, 23};
        //System.out.println(find(arr, 85, 0));
        //System.out.println(find2(arr, 29, 0));
        //System.out.println(findFromLast(arr, 34, arr.length -1));
        //findAll(arr, 25, 0);
        //System.out.println(list);
        //System.out.println(findAll2(arr, 25, 0, new ArrayList<Integer>()));
        //ArrayList<Integer> list2 = new ArrayList<>();
        //ArrayList<Integer> ans = findAll2(arr, 25, 0, list2);
        //System.out.println(ans);
        //System.out.println(list2);
        //System.out.println(findinnewobj(arr, 25, 0));
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(RotatedBS(arr, 0, 0, arr.length -1));
    }
    public static boolean find(int[] arr, int target, int index){
        return index != -1 && (arr[index] == target || find(arr, target, index + 1));
    }

    public static int find2(int[] arr, int target, int index){
        if (index == -1) return -1;
        if (arr[index] == target) return index;
        else{
            return find2(arr, target, index +1);
        }
    }

    public static int findFromLast(int[] arr, int target, int index){
        if (index == -1) return -1;
        if (arr[index] == target) return index;
        else {
            return  findFromLast(arr, target, index -1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAll(int[] arr, int target, int index){
        if (index == arr.length) return;
        if (arr[index] == target) list.add(index);
        findAll(arr, target, index +1);
    }

    public static ArrayList<Integer> findAll2(int[] arr, int target, int index, ArrayList<Integer> list2){
        if (index == arr.length) return list2;
        if (arr[index] == target) list2.add(index);
        return findAll2(arr, target, index +1, list2);
    }

    static ArrayList<Integer> findinnewobj(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        ArrayList<Integer> belowcalls = findinnewobj(arr, target, index +1);
        list.addAll(belowcalls);
        return list;
    }

    static int RotatedBS(int[] arr, int target, int start, int end){
        if (start > end) return -1;

        int mid = start+(end-start)/2;

        if (arr[mid]==target) return mid;

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) return RotatedBS(arr, target, start, mid - 1);
            else return RotatedBS(arr, target, mid + 1, end);
        }

        if (target >= arr[mid] && target <= arr[end]) return RotatedBS(arr, target, mid +1, end);
        return RotatedBS(arr, target, start, mid -1);
    }
}