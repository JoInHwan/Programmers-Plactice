class Solution {
    public boolean solution(int x) {
        int temp = 0;
        String a = String.valueOf(x);
        
        for(int i =0; i<a.length();i++){
          temp = temp + Integer.parseInt(a.substring(i,i+1));
        }
            System.out.println("temp: " + temp);
        if(x%temp==0){
            return true;
        }else{
            return false;
        }
        
        
    
        
    }
}