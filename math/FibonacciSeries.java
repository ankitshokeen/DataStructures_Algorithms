public class FibonacciSeries {
    public static void main(String[] args) {
        fibo(50);
    }
    public static void fibo(int n){
        int num1 = 0;
        int num2 = 1;
        int count  = 1;
        while(count<n){
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            count++;
            System.out.println(num3);
        }
    }
}
