public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Map<Integer, Integer> count = new HashMap<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<Integer> cur = new ArrayList<>();
        List<Integer> A = new ArrayList<>();

        for (int num : nums) {
            if (!count.containsKey(num)) {
                A.add(num);
            }
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        backtrack(A, target, cur, 0);
        return res;
    }

    private void backtrack(List<Integer> A, int target, List<Integer> cur, int i) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (target < 0 || i >= A.size()) {
            return;
        }

        if (count.get(A.get(i)) > 0) {
            cur.add(A.get(i));
            count.put(A.get(i), count.get(A.get(i)) - 1);
            backtrack(A, target - A.get(i), cur, i);
            count.put(A.get(i), count.get(A.get(i)) + 1);
            cur.remove(cur.size() - 1);
        }

        backtrack(A, target, cur, i + 1);
    }
}