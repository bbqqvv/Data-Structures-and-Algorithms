package LeetCode75;

public class _01_Leetcode75_MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) sb.append(word1.charAt(i));
            if (i < word2.length()) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        _01_Leetcode75_MergeStringAlternately m = new _01_Leetcode75_MergeStringAlternately();
        System.out.println(m.mergeAlternately("abcd", "efg"));
    }
}
