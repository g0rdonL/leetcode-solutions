    class Solution {
        int numOfSteps = 0;

        public int numberOfSteps(int num) {
            if (num == 0) {
                return numOfSteps;
            }
            numOfSteps++;
            if (num % 2 == 0) {
                numberOfSteps(num / 2);
            } else if (num % 2 == 1) {
                numberOfSteps(num - 1);
            }
            return numOfSteps;
        }
    }
