class Solution {
    public int solution(int X, int Y, int D) {
        int counter = 0;
        
        while(X<Y){
            X += D;
            counter++;
            
        }
        
        
        return counter;
        
    }
}
