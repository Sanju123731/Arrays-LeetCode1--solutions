class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurrence(nums,  target);
        int last =lastOccurrence( nums,  target);
        return new int[]{first,last};
    }
    public static int firstOccurrence(int[]nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        int firstOccur=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid])
            {
                firstOccur=mid;
                high=mid-1;
            }
            else if(target<nums[mid])
            {
              high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        return firstOccur;
    }
    public static int lastOccurrence(int[]nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        int lastOccur=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==nums[mid])
            {
                lastOccur=mid;
               low=mid+1;
            }
            else if(target<nums[mid])
            {
              high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        return lastOccur;
    }
}