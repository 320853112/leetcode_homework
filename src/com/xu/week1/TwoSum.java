package com.xu.week1;

import java.util.HashMap;


/**
 * 两数之和
 * 1.暴力
 * 2.hashmap
 */
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    return new int[]{map.get(nums[i]), i};
                } else {
                    map.put(target - nums[i], i);
                }

            }
            return new int[]{0, 0};
        }

        public int[] twoSum2(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }

            }
            return new int[]{0, 0};
        }
    }
}
