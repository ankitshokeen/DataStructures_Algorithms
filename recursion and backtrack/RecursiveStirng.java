import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RecursiveStirng {
    public static void main(String[] args) {
        //skip(" ", "abcabcabcabc");
        //System.out.println(skip2("abcabcabcabc"));
        //System.out.println(skipString("hey apple user"));
        //System.out.println(skipStringnoteq("hey apple user app"));
        subSets(" ", "abc");
        //System.out.println(subSetsAL("", "xyz"));
        //subSeqASCII("", "abc");
        //System.out.println(subSeqASCIIal("", "abc"));
        //permutations("", "abcd");
        //System.out.println(permutations2("", "abc"));
        //System.out.println(countpermutations("", "abc"));
        //phoneLetterCombination("", "12");
        //System.out.println(phoneLetterCombinationret("", "12"));
        //System.out.println(phoneLetterCount("", "12"));
        //dice("", 4, 6);
        //System.out.println(diceAL("", 4, 6));
        //reverseString("", "edocteel");
        //stringLength("leetcode", 0);
    }
    static void skip(String s, String c){
        if (c.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = c.charAt(0);
        if (ch == 'a'){
            skip(s, c.substring(1));
        } else {
            skip(s+ch, c.substring(1));
        }
    }

    static String skip2(String p){
        if (p.isEmpty()) return " ";

        char ch = p.charAt(0);

        if (ch == 'a'){
            return skip2(p.substring(1));
        } else {
            return ch + skip2(p.substring(1));
        }
    }

    static String skipString(String p){
        if (p.isEmpty()) return " ";
        if (p.startsWith("apple")){
            return skipString(p.substring(5));
        } else {
            return p.charAt(0) + skipString(p.substring(1));
        }
    }

    static String skipStringnoteq(String p){
        if (p.isEmpty()) return " ";
        if (p.startsWith("app") && !p.startsWith("apple")){
            return skipStringnoteq(p.substring(3));
        } else {
            return p.charAt(0) + skipStringnoteq(p.substring(1));
        }
    }

    static void subSets(String n, String c){
        if (c.isEmpty()){
            System.out.print(n);
            return;
        }
        char ch = c.charAt(0);
        subSets(n+ch, c.substring(1));
        subSets(n, c.substring(1));
    }

    static ArrayList<String> subSetsAL(String n, String c){
        if (c.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(n);
            return list;
        }
        char ch = c.charAt(0);
        ArrayList<String> left = subSetsAL(n+ch, c.substring(1));
        ArrayList<String> right = subSetsAL(n, c.substring(1));
        left.addAll(right);
        return left;
    }

    static void subSeqASCII(String n, String c){
        if (c.isEmpty()){
            System.out.print(n +" ");
            return;
        }
        char ch = c.charAt(0);
        subSeqASCII(n+ch, c.substring(1));
        subSeqASCII(n, c.substring(1));
        subSeqASCII(n+(ch+0), c.substring(1));
    }

    static ArrayList<String> subSeqASCIIal(String n, String c){
        if (c.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(n);
            return list;
        }
        char ch = c.charAt(0);
        ArrayList<String> first = subSeqASCIIal(n+(ch+0), c.substring(1));
        ArrayList<String> second = subSeqASCIIal(n, c.substring(1));
        ArrayList<String> third = subSeqASCIIal(n+ch, c.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    static void permutations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static List<String> permutations2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations2(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int countpermutations(String p, String up){
        int count = 0;
        if (up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + countpermutations(f + ch + s, up.substring(1));
        }
        return count;
    }

    static void phoneLetterCombination(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i=(digit -1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            phoneLetterCombination(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> phoneLetterCombinationret(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i=(digit -1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            ans.addAll(phoneLetterCombinationret(p+ch, up.substring(1)));
        }
        return ans;
    }

    static int phoneLetterCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i=(digit -1)* 3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            count = count + phoneLetterCount(p+ch, up.substring(1));
        }
        return count;
    }

    static void dice(String p, int target, int dice){
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i=1; i<=dice && i<=target; i++){
            dice(p+i, target-i, dice);
        }
    }

    static ArrayList<String> diceAL(String p, int target, int dice){
        if (target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i=1; i<=dice && i<=target; i++){
            list.addAll(diceAL(p+i, target-i, dice));
        }
        return list;
    }

    static void reverseString(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(up.length() -1);
        reverseString(p+ch, up.substring(up.length() -1));
    }

    static void stringLength(String s, int i){
        if (s.isEmpty()){
            System.out.println(i);
            return;
        }
        stringLength(s.substring(1), i +1);
    }
}