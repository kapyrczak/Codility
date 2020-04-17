import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i =0; i< A.length; i++){
            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }
            else{
                map.put(A[i], map.get(A[i])+1);
            }
        }
        
        int number = 0;
        int max = 0;
        
        for( int key : map.keySet()){
            int curr_max = map.get(key);
            if(curr_max > max){
                max = curr_max;
                number = key;
            }
            
        }
        
        
        
        if(max > A.length/2){
            for(int i =0; i< A.length; i++){
                if(A[i] == number)return i;
            }
        
        }
        else{ return -1; }
        return -1;
    }
}
