class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> hmap = new HashMap<>();
        hmap.put(')', '(');
        hmap.put('}', '{');
        hmap.put(']', '[');


        for (char c : s.toCharArray()){
            if(hmap.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == hmap.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }

        }

        return stack.isEmpty();
        
    }
}
