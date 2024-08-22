import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer>list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<numbers.length-1;i++ ){
            
            for(int j = 1; j<numbers.length-i;j++ ){
               set.add(numbers[i] + numbers[i+j]);                
            }
            
        }
        for(int a:set){
           list.add(a);  
        }
       
        Collections.sort(list);
        System.out.println("list: "+list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}