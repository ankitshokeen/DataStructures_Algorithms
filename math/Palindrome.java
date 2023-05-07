import java.util.Scanner;

class Palindrome{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    int a = in.nextInt();
    int b = 0;
    
    while(a>0){
        b = a%10;
        a = a/10;
    }
     if(a==b){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
}
}