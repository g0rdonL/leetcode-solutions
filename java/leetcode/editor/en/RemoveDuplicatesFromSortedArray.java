package leetcode.editor.en;

public class RemoveDuplicatesFromSortedArray {

    // Question 26
    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = nums.length > 0 ? 1 : 0;
            for (int n : nums) {
                if (n > nums[i - 1]) {
                    nums[i++] = n;
                }
            }
            return i;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}