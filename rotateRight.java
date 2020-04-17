class Solution {
    public int[] solution(int[] A, int K) {
        int length = A.length;
        int [] B = new int[length];
        for(int i= 0; i< length; i++){
            B[(i+K)%length] = A[i];
                
            
            
            
        }
        
        return B;
        
        
    }
}
