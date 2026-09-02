class Solution {
    public String minWindow(String s, String t) {


       // if(s.length() < t.length()) return "";
        if (t.isEmpty()) return "";

        Map<Character, Integer> window =  new HashMap<>();
        Map<Character, Integer> count =  new HashMap<>();
        
        for(char c :  t.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) +1);
        }
        int need =  count.size();
        int have =0;
        int l =0;
        int minLength =  Integer.MAX_VALUE;
        int [] ans = { -1,-1};
        for(int r=0 ; r<s.length(); r++){
            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) +1);
            if(window.get(s.charAt(r)) == count.getOrDefault(s.charAt(r), 0)){
                have++;
            }

            while(have == need){
                if((r-l +1) <  minLength){
                    minLength =  r-l+1;
                    ans[0] =  l;
                    ans[1] = r;

                }
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);

                if(count.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < count.get(s.charAt(l))){
                    have--;
                }
                l++;


            }




        }



        return minLength ==  Integer.MAX_VALUE ? "" : s.substring(ans[0] , ans[1] +1);


        
    }
}
