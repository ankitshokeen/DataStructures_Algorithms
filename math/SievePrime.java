public class SievePrime {
    public static void main(String[] args) {
        int n = 50;
        boolean[] sve = new boolean[n+1];

        sieve(sve, n);
    }
    static boolean sieve(boolean[] sve, int n){
        for(int i=2; i*i<=n; i++){
            if(!sve[i]){
                for(int j=i*2; j<=n; j+=i){
                    sve[j] = true;
                }
            }
        }
        for(int k=2; k<=n; k++){
            if(!sve[k]){
                System.out.print(k +" ");
            }
        }
        return true;
    }
}
