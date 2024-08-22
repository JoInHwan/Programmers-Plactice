import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            set.add(i);
        }

        for (int number : numbers) {
            set.remove(number);
        }

        int answer = 0;
        for (int num : set) {
            answer += num;
        }

        return answer;
    }
}
