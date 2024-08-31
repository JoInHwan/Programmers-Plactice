import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i<n; i++){
            
            int n1 = arr1[i];
            int n2 = arr2[i];
           
            List<String>list = new ArrayList<>();
            
            for(int j=0; j<n; j++){
                if( n1%2 ==0 && n2%2 ==0 ){
                    list.add(" ");
                }else{
                    list.add("#");
                }
                n1 = n1/2;
                n2 = n2/2;
            }
            Collections.reverse(list);
            System.out.println(list);
            
            // answer[i] = "";
            for(int j=0; j<n; j++){
               
                if(answer[i]==null){
                    answer[i] =  list.get(j);
                }else{
                   answer[i] = answer[i] + list.get(j); 
                }
               
               
            }
            
            
        }
        
        
        
        
        
        
        
        
        
        return answer;
    }
}