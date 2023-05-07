import java.util.Scanner;

public class FactorialNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int no = input.nextInt();
        int fact = 1;

        for(int i=1; i<=no; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}