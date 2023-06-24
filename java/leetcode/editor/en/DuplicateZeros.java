package leetcode.editor.en;

public class DuplicateZeros {

    // Question 1089
    public static void main(String[] args) {
        new DuplicateZeros().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void duplicateZeros(int[] arr) {
            int index = 0;
            int[] copy = arr.clone();
            for (int i = 0; i < arr.length && index < arr.length; i++, index++) {
                if (copy[i] == 0 && index < arr.length - 1) {
                    arr[index] = copy[i];
                    index++;
                    arr[index] = copy[i];
                } else {
                    arr[index] = copy[i];
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}