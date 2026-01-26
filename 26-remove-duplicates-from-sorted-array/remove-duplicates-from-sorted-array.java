class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]!=nums[j])
                {
                    i++;
                    // copy the new unique value to position i
                    nums[i]=nums[j];

                }
            }
            return i+1;
        }
        
}