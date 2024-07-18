package String.Hard;

public class Smallest_window_in_a_string_containing_all_the_characters_of_another_string {
    public static String smallestWindow(String s, String t)
    {
        // Your code here
        if (s == null || t == null || s.length() ==0 || t.length() == 0 || s.length() < t.length()) {
            return "-1";
        }

        int[] map = new int[128];

        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE,startIndex =0;

        for (char c :t.toCharArray()) {
            map[c]++;
        }

        char[] chS = s.toCharArray();
        while (end < chS.length) {
            if (map[chS[end++]]-- >0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (map[chS[start++]]++ == 0) {
                    count++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE? "-1": new String(chS,startIndex,minLen);


    }
}
