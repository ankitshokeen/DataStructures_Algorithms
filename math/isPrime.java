public class isPrime {
    public static void main(String[] args) {
        int n = 50;
        for(int i=2; i<=n; i++){
            System.out.println(i +" "+ isprime(i));
        }
    }
    static boolean isprime(int n){
        if(n<2){
            return false;
        }

        int c = 2;
        while(c*c <= n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
