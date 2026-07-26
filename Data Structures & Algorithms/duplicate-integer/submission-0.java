
class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        if(nums.length==0 || nums.length==1){
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                ans = true;
            }
        }return ans;
    }
}