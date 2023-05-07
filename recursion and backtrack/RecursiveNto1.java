public class RecursiveNto1 {
    public static void main(String[] args) {
        //func(10);
        funcrev(10);
        //funcboth(10);
    }
    static void func(int n){
        if(n==0) return;
        System.out.println(n);
        func(n -1);
    }
    static void funcrev(int n){
        if(n==0) return;
        funcrev(n -1);
        System.out.println(n);
    }
    static void funcboth(int n){
        if(n==0) return;
        System.out.println(n);
        funcboth(n -1);
        System.out.println(n);
    }
}
