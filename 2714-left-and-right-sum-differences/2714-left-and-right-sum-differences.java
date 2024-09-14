class Solution {
    public int[] leftRigthDifference(int[] nums) {
        final int n = nums.length;
        final int[] ans = new int[n];
        final int[] leftSum = new int[n];
        final int[] rightSum = new int[n];
        for (int i = 0; i < n; i++) {
            leftSum[i] = 0;
            rightSum[i] = 0;
            for (int j = 0; j < i; j++) {
                leftSum[i] += nums[j];
            }
            for (int j = n - 1; j > i; j--) {
                rightSum[i] += nums[j];
            }
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}
