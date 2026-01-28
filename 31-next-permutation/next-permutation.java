class Solution {
    public void nextPermutation(int[] nums) {
        // tc=O(n),Sc=O(1)
        int pivot=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }
            if(pivot==-1)
            {
             reverse(nums,0,n-1);
             return;
            }
             if(pivot!=-1)
             {
                for(int i=n-1;i>pivot;i--)
                {
                    if(nums[i]>nums[pivot])
                    {
                        swap(nums,i,pivot);
                        break;
                    }
                }
             }
             reverse(nums,pivot+1,n-1);
           }
        public void reverse(int nums[],int i,int j)
        {
             while(i<j)
             {
                swap(nums,i,j);
                i++;
                j--;
             }
        }
        public void swap(int nums[],int i,int j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    
}