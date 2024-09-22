class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        double temp = 0;
        
        for(double a : numbers){
            
            temp+=a;
            answer = (double)temp / (double)numbers.length;
        }
        
        return answer;
    }
}