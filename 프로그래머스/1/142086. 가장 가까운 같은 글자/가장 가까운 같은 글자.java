class Solution {
    public int[] solution(String s) {
        
        
        
    int[] answer = new int[s.length()];
    int leng =  s.length()-1;
       
    answer[0] = -1;    
        
        for(int i=leng; i>0;i--){            
            
            for(int j=i-1; j>=0 ;j--){  
                
                
                
                if(s.charAt(i)==s.charAt(j)){
                    
                   answer[i] = i-j;
                    
                    break;
                }else{
                    answer[i] = -1;
                }                  
                
           }
       }    
           
            
     
        
        
        return answer;
    }
}