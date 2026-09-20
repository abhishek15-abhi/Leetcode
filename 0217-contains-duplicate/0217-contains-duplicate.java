class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
        if(h.containsKey(nums[i]))
            return true;
        else
            h.put(nums[i],false);
        }
        return false;
    }
}