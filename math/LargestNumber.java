import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Largest number is:" + a);
        }
        else{
            System.out.println("Largest number is:" + b);
        }
    }
}