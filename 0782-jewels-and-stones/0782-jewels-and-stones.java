class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    ans += 1;
                }
            }

        }
        return ans;
    }
}
