package cn.rockingwang.study.leetcode.no000;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangpeng
 * @date 2018/10/25 14:37
 */
public class Solution001 {

    /**
     * <p>Given an array of integers, return indices of the two numbers such that they add up to a specific target.</p>
     * <p>You may assume that each input would have exactly one solution, and you may not use the same element twice.</p>
     * <b>Example:</b>
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;

    }

    public int[] twoSumHashMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution001 solution001 = new Solution001();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        long start = System.currentTimeMillis();
        int[] result = solution001.twoSumHashMap(nums, target);
        long end = System.currentTimeMillis();
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println("运行时间:" + (end - start));
    }

}
