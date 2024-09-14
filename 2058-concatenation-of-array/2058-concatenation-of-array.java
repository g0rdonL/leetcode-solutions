class Solution {
    public int[] getConcatenation(int[] nums) {
        final int n = nums.length;
        final int[] ans = new int[n * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
