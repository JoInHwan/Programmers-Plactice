class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int temp = countDiv(i);
            if (temp > limit) {
                temp = power;
            }
            answer += temp;
        }
        
        return answer;
    }
    

    private int countDiv(int number) {
        if (number == 1) {
            return 1;
        }
        
        int count = 0;
        int sqrt = (int) Math.sqrt(number); 
        
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                if (i == number / i) { 
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        
        return count;
    }
}
