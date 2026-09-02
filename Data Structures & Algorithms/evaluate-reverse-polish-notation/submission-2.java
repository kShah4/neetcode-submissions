class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String c : tokens){
            if(c.equals("+")){

                stack.push(stack.pop() + stack.pop());
            }else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());

            }else if(c.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);

            }else if(c.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(0 + (c));
            }

        }

        return stack.pop();





        
    }
}
