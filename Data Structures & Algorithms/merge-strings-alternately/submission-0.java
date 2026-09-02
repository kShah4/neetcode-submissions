class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int c1 = 0;
        int c2 =0;
        while(c1<word1.length() || c2<word2.length()){
            if(c1<word1.length() && c2<word2.length()){
            result = result + word1.charAt(c1) + word2.charAt(c2);
            c1++;
            c2++;
            }
            if(c1 >= word1.length()){
                char char1 = "";
            }





        }
        
    }
}