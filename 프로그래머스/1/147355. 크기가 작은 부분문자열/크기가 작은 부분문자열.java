class Solution {
    public int solution(String t, String p) {
               
        int answer = 0;
        
        int tl = t.length();    
        int pl = p.length();     
                              
        long pv = Long.parseLong(p);
                
        for(int i=0; i<= tl-pl; i++){    
            long temp =  Long.parseLong(t.substring(i,pl+i)); 
            
            if(temp<= pv ){
                answer++;
            }
            
        }
               
        return answer;
    }
}