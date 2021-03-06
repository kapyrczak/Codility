class Solution {
    public int solution(String S) {
        
        if(S.length() == 0) return 1;
        
         Stack<Character> stack = new Stack<>();
         
         for(int i = 0; i < S.length(); i ++){
             
            if(S.charAt(i)=='[') stack.push(']');
            else if(S.charAt(i) == '(') stack.push(')');
            else if(S.charAt(i) == '{') stack.push('}');
            
            else if(S.charAt(i) == ']' || S.charAt(i) == ')' || S.charAt(i) == '}'){
                
                if(stack.isEmpty()) return 0;
                
                char temp = stack.pop();
                if(temp != S.charAt(i)) return 0;
               
                
            }
         }
        
        if(stack.isEmpty()) return 1;
        
        return 0;
        
        
        
        
        
        
    }
}
