class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result =  new ArrayList<>();
        List<Integer> combinations =  new ArrayList<>();
        backTrack(result , combinations, nums , target, 0);
        return result;
        
    }

    public void backTrack(List<List<Integer>> result,List<Integer> combinations, int [] nums, int target, int i ){{
        if(i>= nums.length || target<0){
            return;
        }

        if(target == 0){
            result.add(new ArrayList(combinations));
            return;
        }
        combinations.add(nums[i]);
        backTrack(result , combinations, nums , target-nums[i], i);
        combinations.remove(combinations.size() -1);
        backTrack(result , combinations, nums , target, i+1);



    }

    }

}
