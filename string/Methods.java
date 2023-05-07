import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        String name = "ankit shokeen";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('i'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("     shokeen     ".strip());
    }
}
