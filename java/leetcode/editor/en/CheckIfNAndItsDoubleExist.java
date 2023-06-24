package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {

    // Question 1346
    public static void main(String[] args) {
        new CheckIfNAndItsDoubleExist().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                map.put(arr[i], i);
            }
            for (int i = 0; i < n; i++) {
                if (map.containsKey(2 * arr[i]) &&
                        map.get(2 * arr[i]) != i) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}