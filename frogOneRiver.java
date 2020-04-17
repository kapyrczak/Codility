class Solution {
    public int solution(int X, int[] A) {
        Set<Integer> hash_Set = new HashSet<Integer>(); 
        
        for(int i =1; i <= X; i++){
            hash_Set.add(i);
        }
        
        for(int i =0; i < A.length; i++){
            if(hash_Set.contains(A[i])) hash_Set.remove(A[i]);
            if(hash_Set.isEmpty()) return i;
            
            
            
        }
        
        return -1;
        
        
        
        
        
    }
}
