class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Charchter> hmap = new HashMap<>();
        hmap.add(')', '(');
        hmap.add('}', '{');
        hmap.add(']', '[');


        for (char c : s.toCharArray()){
            if(hmap.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == hmap.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push();
            }

        }

        return stack.isEmpty();
        
    }
}
