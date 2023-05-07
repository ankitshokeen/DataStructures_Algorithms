import java.util.Scanner;

public class Discount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter product price");
        int p = input.nextInt();
        
        System.out.println("Enter discount percentage");
        int d = input.nextInt();
        
        int f = (p*d/100);
        System.out.println("discounted price" + f);

        int t = (p-f);
        System.out.println("Final payable amount " + t);
    }
}