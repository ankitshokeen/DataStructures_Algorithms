public class NoOfDigits {
    public static void main(String[] args) {
        int digit = 10;
        int base = 2;

        int ans = (int) (Math.log(digit) / Math.log(base)) +1;

        System.out.println(ans);
    }
}
