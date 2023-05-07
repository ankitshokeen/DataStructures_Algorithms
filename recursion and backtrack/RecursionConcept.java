public class RecursionConcept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0) return;
        System.out.println(n);
        // fun(n--); this will throw stack over flow exception because this is calling value first and then decrementing value.
        fun(--n); // this will decrement the value first and then call the function.
    }
}