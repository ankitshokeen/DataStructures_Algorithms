import java.util.Arrays;

public class RecursiveSorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        //bubble(arr, arr.length -1, 0);
        //System.out.println(Arrays.toString(arr));
        //selection(arr, arr.length, 0, 0);
        //System.out.println(Arrays.toString(arr));
        //arr = mergesort(arr);
        //System.out.println(Arrays.toString(arr));
        //inplacemerge(arr, 0, arr.length);
        //System.out.println(Arrays.toString(arr));
        QuickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int r, int c){
        if (r == 0) return;
        if (c<r){
            if (arr[c]>arr[c+1]){
                // swap
                int temp = arr[c];
                arr[c] = arr[c +1];
                arr[c +1] = temp;
            }
            bubble(arr, r, c +1);
        } else {
            bubble(arr, r -1, 0);
        }
    }

    static void selection(int[] arr, int r, int c, int max){
        if (r == 0) return;
        if (c<r){
            if (arr[c]>arr[max]){
                selection(arr, r, c +1, c);
            } else {
                selection(arr, r, c +1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r -1];
            arr[r -1] = temp;
            selection(arr, r -1, 0, 0);
        }
    }

    static int[] mergesort(int[] arr){
        if (arr.length == 1) return arr;

        int mid = arr.length /2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right){
        int[] ans = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if (left[i]<right[j]){
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }

    static void inplacemerge(int[] arr, int s, int e){
        if (e-s == 1) return;

        int m = (s+e)/2;

        inplacemerge(arr, s, m);
        inplacemerge(arr, m, e);

        inplacesort(arr, s, m, e);
    }
    private static void inplacesort(int[] arr, int s, int m, int e){
        int[] ans = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while(i<m && j<e){
            if (arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int l=0; l<ans.length; l++){
            arr[s+l] = ans[l];
        }
    }

    public static void QuickSort(int[] nums, int low, int high){
        if(low>=high) return;

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(nums, s, high);
        QuickSort(nums, low, e);
    }
}