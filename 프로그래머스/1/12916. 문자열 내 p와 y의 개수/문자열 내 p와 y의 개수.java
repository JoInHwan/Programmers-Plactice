class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;
        
        for(int i=0; i<s.length(); i++){
            
            String t = s.substring(0+i,1+i);
            String lt = t.toUpperCase();
            
            if( lt.equals("P")) {
                pCnt++;                
            }else if(lt.equals("Y")){
                yCnt++;
            }         
            
        }

        if( pCnt == yCnt){
            return true; 
        }else{
            return false;
        }
    }
}