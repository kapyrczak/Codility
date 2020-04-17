int [] B = Arrays.stream(A).filter(x -> x>0).distinct().sorted().toArray();
        if(B.length == 0) return 1;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i =0; i< B.length; i++){
            set.add(B[i]);
        }
        
       
        for(int i = 1; i<= B.length; i++){
            if(set.contains(i) != true) return i;
            
        }
        
        return B.length+1;

}
