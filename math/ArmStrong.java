import java.util.Scanner;
public class ArmStrong{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    int rem = 0;
    int root = 0;
    
    while(num!=0){
        rem = num%10;
        root = (num*num*num);
        num++;
            if(num==root){
                System.out.println("Armstrong number");
            }else{
                System.out.println("not Armstrong number");
            }
    }
}
}