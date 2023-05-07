import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        int n = 50;

        factor1(n);
        factor2(n);
        factor3(n);
    }
    // O(n)
    public static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i +" ");
            }
        }
    }
    // O(sqrt(n))
    public static void factor2(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i +" ");
                } else{
                    System.out.print(i +" "+ n/i +" ");
                }
            }
        }
    }
    // O(sqrt(n))
    public static void factor3(int n){
        ArrayList<Integer> find = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i +" ");
                } else{
                    System.out.print(i +" ");
                    find.add(n/i);
                }
            }
        }
        for(int i=find.size() -1; i>=0; i--){
            System.out.print(find.get(i) +" ");
        }
    }
}