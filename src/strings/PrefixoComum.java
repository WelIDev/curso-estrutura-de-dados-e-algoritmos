package strings;

import java.util.Arrays;

public class PrefixoComum {

    public static void main(String[] args) {

        String[] v1 = {"flower", "flow", "flight"};
        String[] v2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(v1));
        System.out.println(longestCommonPrefix(v2));
    }

    public static String longestCommonPrefix(String[] v) {

        Arrays.sort(v);

        String first = v[0];
        String last = v[v.length - 1];

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return prefix.toString();
            } else {
                prefix.append(v[i].charAt(i));
            }
        }
        return prefix.toString();
    }
}
