    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int answer = 0;
            int prev = 0;

            for (char c : s.toCharArray()) {
                int curr = map.get(c);
                answer += curr;
                if (curr > prev) {
                    answer -= 2 * prev;
                }
                prev = curr;
            }

            return answer;
        }
    }
