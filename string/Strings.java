import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        String a = "ankit";
        String b = "ankit";
        System.out.println(a == b);

        String name1 = new String("ankit");
        String name2 = new String("ankit");
        System.out.println(name1 == name2);

        System.out.println(56);

        Integer num1 = 35;
        Integer num2 = 35;
        System.out.println(num1.toString());

        Integer num3 = new Integer(65);
        Integer num4 = new Integer(65);
        System.out.println(num3.toString());

        System.out.println(new int[] {60, 70, 80, 90, 99});
        System.out.println(Arrays.toString(new int[] {10, 20, 30, 40, 50}));

        // preety printing

        float f = 567.1294f;
        System.out.printf("Formatted number is %.2f", f);

        System.out.println();

        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();

        // place holders

        /* There are many format specifiers we can use. Here are some common ones:

                %c - Character
                %d - Decimal number (base 10)
                %e - Exponential floating-point number
                %f - Floating-point number
                %i - Integer (base 10)
                %o - Octal number (base 8)
                %s - String
                %u - Unsigned decimal (integer) number
                %x - Hexadecimal number (base 16)
                %t - Date/time
                %n - Newline */

        System.out.printf("hello my name is %s and i am %s", "ankit", "cool");

    }
}
