public class Average{
    public static void main(String[] args){
        
        int n[] = {10,20,30,40,50};
        int sum = 0;
        int av = 0;
        
        for(int i=0; i<=n.length-1; i++){
           sum=sum+n[i];
        }
        av=sum/n.length;
        
        System.out.println(av);
    }
}