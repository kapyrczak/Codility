class Solution {
    public int solution(int[] A) {
        long first = 1;
        long last = A.length+1;
        long amount = A.length+1;
        long sum = (first+last)*amount/2;    //z sumy ciagu arytmetycznego,
                                            //do sumy wliczam brakujacy element
        
        for(int i = 0; i< A.length; i++){
            sum -= A[i];
        }                                    
        
        return (int)sum;
    }
}
