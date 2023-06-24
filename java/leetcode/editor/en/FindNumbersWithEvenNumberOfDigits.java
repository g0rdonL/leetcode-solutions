package leetcode.editor.en;

public class FindNumbersWithEvenNumberOfDigits {

    // Question 1295
    public static void main(String[] args) {
        new FindNumbersWithEvenNumberOfDigits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (numOfDigits(num) % 2 == 0) {
                    count++;
                }
            }
            return count;
        }

        private int numOfDigits(int num) {
            return (int) (Math.log10(num) + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}