import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
    
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
               
        //System.out.println( commands[0][0]);
        // System.out.println( commands.length );
        
        for(int i=0; i<commands.length; i++){
            // 첫번째 행부터             
            int x = commands[i][0]; //첫번째배열 시작번호
            int k = commands[i][2]; // 짤라야할 번호
            int cnt = commands[i][1]-commands[i][0]+1; // 첫번째 배열 크기
                        
            System.out.println("x: "+x);
            System.out.println("cnt: "+ cnt);
            
            int[] temp = new int[cnt];
            for(int j=0; j<cnt ; j++ ){                 
                temp[j] = array[x+j-1];
            }
            Arrays.sort(temp);
            System.out.println("temp: "+ Arrays.toString(temp)); 
            answer[i] = temp[k-1];                       
        }
              
        return answer;
    }
}