import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 0;
        
        List<Integer> list = new ArrayList<>();
                
        while(x< 10){
            if(   Math.pow(10,x) > n ){
                break;
            }
            x++;
        }
        
        for(int i =0; i<100; i++){
            list.add(n%3);
            n = n/3;
            
            if(n==0){
                break;
            }             
        }
         Collections.reverse(list);
        int s = list.size();
        
        for(int j=0; j< s; j++){
            
            int y =  list.get(j);
            
            answer = answer + (int)(y* Math.pow(3,j) );
        }
        
        
        return answer;
    }
}