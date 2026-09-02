class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        HashMap<Character, Integer> count1 = new HashMap<>();
        for(char c: s1.toCharArray()){
            count1.put(c, count1.getOrDefault(c,0) + 1);
        } 
        int need = coint1.size();
        int curr =0 ;
        Map<Character, Integer> count2 = new HashMap<>();
        for(int i =0 ; i<s2.length(); i++){
            char c = s.charAt(i);
            count2.put(c, count2.getOrDefault(c,0) + 1);

            
            
        }
        
    }
}
