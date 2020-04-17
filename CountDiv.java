class Solution {
    public int solution(int A, int B, int K) {
        int B_div = (int)Math.floor(B/K);
        int A_div = (int)Math.floor(A/K);
        if(A%K ==0) return B_div-A_div+1;
        else return B_div-A_div;
    }
}
