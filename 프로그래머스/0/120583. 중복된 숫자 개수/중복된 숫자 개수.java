class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        
        for(int c:array){
            if(c == n){
                answer++;
            }
        }
        return answer;
    }
}