package leetcode.editor.en;

import java.util.Arrays;

public class LongestCommonPrefix {

    // Question 14
    public static void main(String[] args) {
        new LongestCommonPrefix().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }

            Arrays.sort(strs);
            String first = strs[0];
            String last = strs[strs.length - 1];
            int index = 0;
            while (index < first.length() && first.charAt(index) == last.charAt(index)) {
                index++;
            }
            return index == 0 ? "" : first.substring(0, index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}