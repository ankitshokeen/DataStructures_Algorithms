import java.util.Scanner;

public class SimpleIntrest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Amount Borrowed");
        int p = input.nextInt();

        System.out.println("Enter Number of Years");
        int t = input.nextInt();

        System.out.println("Enter Rate of Intrest");
        int i = input.nextInt();

        System.out.println("Simple Intrest");
        int si = (p*t*i)/100;

        System.out.println(si);
    }
}