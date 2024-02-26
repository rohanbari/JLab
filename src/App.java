import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        String input = "abc";
        List<String> result = permutation(input);

        System.out.println(result.toString());
    }

    public static List<String> permutation(String input) {
        List<String> result = new ArrayList<>();
        String output = "";

        permute(input, output, result);
        return result;
    }

    /**
     * Finding the permutation of a given string using recursion.
     * 
     * @param in   Input string
     * @param out  Output string
     * @param list Output list of permutations
     */
    public static void permute(String in, String out, List<String> list) {
        if (in.length() == 0) {
            list.add(out);
            return;
        }

        for (int i = 0; i < in.length(); i++) {
            // Removing the character of i-th index only and keeping the before
            // and after substrings concatenated.
            //
            // For example, if i = 1, then from "abc", "a" + "c", "b".
            permute(in.substring(0, i) + in.substring(i + 1),
                    out + in.charAt(i), list);
        }
    }
}
