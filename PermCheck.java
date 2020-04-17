class Solution {
    public int solution(int[] A) {
        
        
        Set<Integer> set = new HashSet<Integer>(); 
        
        for(int i =0; i < A.length; i++){
            set.add(A[i]);
        }
        
        for(int k=1; k <= A.length; k++){
            if(!set.contains(k)) return 0;
        }
            
            
        
        
        return 1;
        
        
        
    }
}
 


OR



Arrays.sort(A);
for(int i =0; i < A.length; i++){
	if(i>0 && A[i] != A[i-1]+1) return 0;

}

return 1;        
        
        
 
