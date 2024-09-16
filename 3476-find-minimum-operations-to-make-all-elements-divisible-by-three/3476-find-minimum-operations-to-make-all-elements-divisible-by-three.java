class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            int remainder = num % 3;
            res += Math.min(remainder, 3 - remainder);
        }
        return res;
    }
}