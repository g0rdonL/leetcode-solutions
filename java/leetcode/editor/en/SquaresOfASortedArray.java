package leetcode.editor.en;

import java.util.Arrays;

public class SquaresOfASortedArray {

    // Question 977
    public static void main(String[] args) {
        new SquaresOfASortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] *= nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}