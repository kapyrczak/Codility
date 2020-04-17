class Solution {
    public int solution(int N) {
        String str = Integer.toString(N, 2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int counter = 0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i)=='0')counter++;
         
            else{
                list.add(counter);
                counter =0;
            }
            
            
        }
        
        int max = list.get(0);
        for(int i = 1; i< list.size(); i++){
            max = Math.max(max, list.get(i));
            
        }
        
        return max;
        
        
    }
}

