class Solution {
    public int[] shuffle(int[] nums, int n) {
        final int[] ans = new int[n * 2];
        for (int i = 0; i < n ; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[n + i];
        }
        return ans;
    }
}
