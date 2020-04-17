class Solution {
    public int solution(int[] A, int[] B) {
        
        Stack<Integer> stack = new Stack<Integer>(); 
        
        int number = A.length;
        
        for(int i = 0; i < B.length; i++){
            
            if(B[i] == 1) stack.push(A[i]);
            
            if(B[i] == 0 ){
                while(!stack.isEmpty()){
                    
                    if(A[i] > stack.peek()){
                        number--;
                        stack.pop();
                    }
                    
                    else if(A[i] < stack.peek()){
                        number--;
                        break;
                    }
                    
                }
                
            }
            
            
            
            
            
        }
        
        return number;
        
    }
}
