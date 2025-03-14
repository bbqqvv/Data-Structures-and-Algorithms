package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * _1431_Leetcode_KidsWithTheGreatestNumberOfCandies
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/14/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/14/2025    VANQUOCBUI    Create
 */


public class _1431_Leetcode_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
