import java.util.Scanner;

public class Usd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Rupee Value ");
        float rupee = input.nextInt();
        float usd = (rupee/82);
        System.out.println("USD Value " + usd);
    }
}