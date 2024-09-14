class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer: accounts) {
            int wealth = 0;
            for (int account : customer) {
               wealth += account;
            }
           if (wealth > max) {
               max = wealth;
           }
        }
        return max;
    }
}
