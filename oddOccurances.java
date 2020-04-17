class Solution {
    public int solution(int[] A) {
        
      
      int odd = A[0];
      
      for(int i = 1; i< A.length; i++){
            odd = odd ^ A[i];
         
      }
 
        return odd;
        
        
    }
}
