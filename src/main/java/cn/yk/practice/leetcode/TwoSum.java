package cn.yk.practice.leetcode;

import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
 * are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(numbers[i])) {
                int j = (int) hashMap.get(numbers[i]);
                return new int[]{++j, ++i};
            } else {
                hashMap.put(target - numbers[i], i);
            }
        }
        return numbers;
    }


    public int[] twoSumOn2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int nextNumber = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == nextNumber)
                    return new int[]{++i, ++j};
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum s = new TwoSum();
        System.out.println(s.twoSum(numbers, target)[1]);
    }
}
