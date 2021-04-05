package com.xu.week1;

/**
 * 思路：
 * 1.开一个新的数组  时间O(N) ,空间O(N)
 *2.反转数组两次，第一次整个数组反转，第二次分两个部分反转，[0, k-1][k,length]
 *3.遍历一遍，每个数字都和最后的目标位置交换 不太理解，TODO
 */
public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate1(int[] nums, int k) {
            k = k%nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
        }

        private void reverse(int[] nums, int begin, int end) {
            while (begin<end){
                int temp = nums[begin];
                nums[begin] = nums[end];
                nums[end] = temp;
                begin ++;
                end--;
            }
        }

        public void rotate2(int[] nums, int k) {
            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                res[(i+k)%nums.length] = nums[i];
            }
            System.arraycopy(res, 0, nums, 0, nums.length);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
