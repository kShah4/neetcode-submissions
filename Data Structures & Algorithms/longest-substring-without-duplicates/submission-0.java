class Solution {
    public int lengthOfLongestSubstring(String s) {
     int size = s.length();
     if(size<=1) return size;
     int ans =1;
     int l =0;
     int r =0;
     HashSet<Character> hset = new HashSet<>();
     while(r<size){
        while(hset.contains(s.charAt(r))){
            hset.remove(s.charAt(l));
            l++;
        } 

            hset.add(s.charAt(r));
            ans = Math.max(ans, r-l+1);
            r++;
        

     }

     return ans;

        
    }
}
