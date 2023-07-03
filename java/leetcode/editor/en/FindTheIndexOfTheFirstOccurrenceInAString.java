package leetcode.editor.en;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    // Question 28
    public static void main(String[] args) {
        new FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            for (int i = 0; ; i++) {
                for (int j = 0; ; j++) {
                    if (j == needle.length()) {
                        return i;
                    }

                    if (i + j == haystack.length()) {
                        return -1;
                    }

                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    }
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}