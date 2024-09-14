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
