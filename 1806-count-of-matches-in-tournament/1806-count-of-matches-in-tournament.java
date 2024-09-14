    class Solution {
        int matches = 0;

        public int numberOfMatches(int n) {
            if (n == 1) {
                return matches;
            }
            if (n % 2 == 0) {
                matches += n / 2;
                numberOfMatches(n / 2);
            } else {
                matches += (n - 1) / 2;
                numberOfMatches((n - 1) / 2 + 1);
            }
            return matches;
        }
    }
