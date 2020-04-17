class Solution {
    public int solution(int[] A) {
         
          int east = 0;
          int passed = 0;
          
          for(int i =0; i<A.length; i++){
              if(A[i] == 0) east++;
              
              if(A[i]==1) passed += east;
              
              
          }
          
          
          if(passed > 1000000000 || passed < 0) return -1;
          
          return passed;
          
    }
}


