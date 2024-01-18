import java.util.Arrays;
public class LongestCommonPrefix {
    StringBuilder result = new StringBuilder();

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (i < last.length && first[i] == last[i]) {
                result.append(first[i]);
            } else {
                break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix LCP = new LongestCommonPrefix();
        String[] input = {"flower", "flor", "flight"};
        System.out.println(LCP.longestCommonPrefix(input));
    }
}

