public class FindUnique {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int unique = 0;
        for(int i : arr){
            unique ^= i;
        }
        return unique;
    }
}
