package leetcode.editor.en;

public class AddBinary {

    // Question 67
    public static void main(String[] args) {
        new AddBinary().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder answer = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += a.charAt(i--) - '0';
                }
                if (j >= 0) {
                    sum += b.charAt(j--) - '0';
                }
                carry = sum > 1 ? 1 : 0;
                answer.append(sum % 2);
            }
            if (carry != 0) {
                answer.append(carry);
            }
            return answer.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}