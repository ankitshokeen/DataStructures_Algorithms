import java.util.*;
public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 5);
        System.out.println((char) ('a' + 5));
        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("ankit" + new Integer(65));
        System.out.println(new Integer(55) + "" + new ArrayList<>());
        String ans = new Integer(88) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');
    }
}
