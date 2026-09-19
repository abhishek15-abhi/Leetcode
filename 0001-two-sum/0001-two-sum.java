class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            h.put(nums[i],i);
        for(int j=0;j<nums.length;j++){
            int validno=target-nums[j];
            if(h.containsKey(validno) && h.get(validno)!=j)
                return new int[]{h.get(validno),j};
        }return null;
    }
}