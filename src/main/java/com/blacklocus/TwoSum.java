package com.blacklocus;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    /**
     * Source URL: <a href="https://leetcode.com/problems/two-sum/">...</a>
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     *
     * @param nums   the array of numbers to search through
     * @param target the number that two array members must equal
     * @return an array that contains the indices of two members of nums that sum to the target
     */
    public int[] twoSum(int[] nums, int target) {
        // Key = difference, Value = the index in the array
        Map<Integer, Integer> addends = new HashMap<>();

        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (addends.containsKey(difference)) {
                solution[0] = addends.get(difference);
                solution[1] = i;
                return solution;
            } else {
                addends.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
