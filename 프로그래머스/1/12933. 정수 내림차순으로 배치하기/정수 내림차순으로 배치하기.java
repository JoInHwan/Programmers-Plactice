import java.util.*;

class Solution {
    public long solution(long n) {
   
        String str = Long.toString(n);
        
        List<Character> list = new ArrayList<>();
        
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }
        list.sort(Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            sb.append(ch);
        }
        
        long answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}
