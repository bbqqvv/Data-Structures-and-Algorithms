package LeetCode75;

/**
 * _1071_Leetcode_GreatestCommonDivisorOfStrings
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/12/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/12/2025    VANQUOCBUI    Create
 */




public class _1071_Leetcode_GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        return (str1 + str2).equals(str2 + str1)
                ? str1.substring(0, gcd(str1.length(), str2.length()))
                : "";
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
