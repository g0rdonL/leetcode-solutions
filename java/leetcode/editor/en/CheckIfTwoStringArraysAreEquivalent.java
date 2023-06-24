package leetcode.editor.en;

public class CheckIfTwoStringArraysAreEquivalent {

    // Question 1662
    public static void main(String[] args) {
        new CheckIfTwoStringArraysAreEquivalent().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();

            for (final String word : word1) {
                str1.append(word);
            }

            for (final String word : word2) {
                str2.append(word);
            }

            return str1.toString().equals(str2.toString());
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}