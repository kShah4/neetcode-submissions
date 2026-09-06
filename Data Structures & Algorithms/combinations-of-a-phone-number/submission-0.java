class Solution {
    String [] mapping =  {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
 
        List<String> result =  new ArrayList<>();
        if (digits.isEmpty()) return result;

        StringBuilder curr =  new StringBuilder();
        backtrack(result, curr, digits, 0);
        return result;
    }

    public void backtrack(List<String> result, StringBuilder curr, String digits, int i){
        if(curr.length() == digits.length()){
            result.add(curr.toString());
            return;
        }
        String chars =  mapping[digits.charAt(i) - '0'];
        for(char c : chars.toCharArray()){

            curr.append(c);
            backtrack(result, curr, digits, i+1);
            curr.deleteCharAt(curr.length() -1);

        }
    }
}
