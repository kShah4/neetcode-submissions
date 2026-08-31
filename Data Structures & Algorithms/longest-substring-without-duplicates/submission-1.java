class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if (size <= 1) return size;

        int l = 0;
        int max = 0;
        Set<Character> characters =  new HashSet<>();
        for(int r =0 ; r< size;  r++){

            while(characters.contains(s.charAt(r))){
                characters.remove(s.charAt(l));
                l++;
            }
            characters.add(s.charAt(r));
            max = Math.max(r-l+1, max);


        

        }
        return max;
    }
}