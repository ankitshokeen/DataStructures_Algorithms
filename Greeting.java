import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("Happy Birthday " + name);
    }
}