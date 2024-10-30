class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (final int num : nums) {
            result ^= num;
        }
        return result;
    }
}