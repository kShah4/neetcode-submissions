// import java.util.*
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<nums.length; i++){
            if(set.contains(nums[i])) {
                System.out.println(i);
                System.out.println(set.contains(i));
                return true;
            }
            set.add(nums[i]);
        }
        
        return false;
    }
}
