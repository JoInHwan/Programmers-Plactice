import java.util.*;
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        for(int i=0; n>=a; i++){
            answer = answer + (n/a)*b;
            n =  (n/a)*b + n%a;
            System.out.println("n: "+n + ",answer: " + answer);
        }
        
        return answer;
    }
}