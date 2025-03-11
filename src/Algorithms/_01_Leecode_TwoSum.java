package Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * TwosSum
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/11/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/11/2025    VANQUOCBUI   Create
 */

class _01_Leecode_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}