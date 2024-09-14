    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;

            for (final int num : nums) {
                if (num == 1) {
                    count++;
                } else {
                    if (max < count) {
                        max = count;
                    }
                    count = 0;
                }
            }
            
            if (max < count) {
                max = count;
            }
            return max;
        }
    }
