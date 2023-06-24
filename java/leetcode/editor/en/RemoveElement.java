package leetcode.editor.en;

public class RemoveElement {

    // Question 27
    public static void main(String[] args) {
        new RemoveElement().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            return i;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}