public class CheckOdd {
    public static void main(String[] args) {

        System.out.println(ifOdd(66));
    }
    static boolean ifOdd(int n){
        return (n & 1) == 1;
    }
}
