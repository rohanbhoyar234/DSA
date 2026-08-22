class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> comp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(comp.containsKey(complement))
            {
                return new int[] {comp.get(complement),i};
            }

            comp.put(nums[i],i);
        }

        return new int[] {};
    }
}