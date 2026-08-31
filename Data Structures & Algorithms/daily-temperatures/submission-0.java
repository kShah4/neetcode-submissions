public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); // pair: [temp, index]

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > temperatures[stack.peek()]) {
                int pair = stack.pop();
                res[pair] = i - pair;
            }
            stack.push(i);
        }
        return res;
    }
}