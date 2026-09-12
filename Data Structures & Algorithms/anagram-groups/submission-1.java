class Solution {
    //11:26
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String,  List<String>> anagrams =  new HashMap<>();
    List<List<String>> result =  new ArrayList<>();
    for(String str :  strs){
        int [] chars =  new int[26];
        for(char c  :  str.toCharArray()){
            chars[c-'a']++;
        }
        String key =  Arrays.toString(chars);
        if(anagrams.containsKey(key)){
            List<String> value = anagrams.get(key);
            value.add(str);

        }else{
            anagrams.putIfAbsent(key,  new ArrayList<>() );
            List<String> value = anagrams.get(key);
            value.add(str);
        }
    }
    for(List<String> list : anagrams.values()){
        result.add(list);
    }
    
    return result;
        
    }
}
