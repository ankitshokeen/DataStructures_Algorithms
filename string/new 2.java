import java.util.Scanner;
class Demo{
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("enter some input");
	String your_name = input.nextLine();
	System.out.println("your name is: " + your_name);
}
}