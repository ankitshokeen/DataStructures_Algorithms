import java.util.Scanner;

public class Bill{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Costumer Name");
        String name = input.nextLine();
        System.out.println("Enter Unit Consumed");
        int unit = input.nextInt();
        System.out.println("Duration of Months");
        int months = input.nextInt();
        int rate = 8;
        
        System.out.println(name);
        System.out.println(unit*rate*months);
    }
}
