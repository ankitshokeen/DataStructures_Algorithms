public class RecursiveBS {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 33, 44, 55};
        int target = 20;
        System.out.println(search(arr, target, 0, arr.length -1));
    }
    public static int search(int[] arr, int target, int start, int end){
        int mid = start+(end-start)/2;

        if(start>end) return -1;

        if(arr[mid]==target) return mid;

        if(target<arr[mid]) return search(arr, target, start, mid -1);

        return search(arr, target, mid +1, end);
    }
}