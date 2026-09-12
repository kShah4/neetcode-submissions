class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n =  nums.length;
        HashMap<Integer, Integer> count =  new HashMap<>();
        List<Integer>[] freq =  new List[n +1];


        for(int i =0 ;  i < n +1 ;  i++){
            freq[i] =  new ArrayList<>();

        }
        for(int i =0 ; i < nums.length;  i++){
            count.put(nums[i],count.getOrDefault(nums[i], 0 )+1);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int  i =  entry.getKey();
            int  j  =  entry.getValue();
            freq[j].add(i); 

        }
        int[] res =  new int[k];
        int index=0 ;
        for(int i = freq.length -1  ;  i > 0 ;  i--){
            if(k>0){
                for(int num  : freq[i]){
                    res[index++] = num;
                    k--;
                }


            }
        }


        return res;
    }
}
