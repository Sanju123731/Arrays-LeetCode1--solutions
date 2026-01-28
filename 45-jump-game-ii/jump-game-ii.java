class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==1)
        return 0;
        if(nums[0]==0)
        return -1;
        int jump=0;
        int dest=0;
        int pos=0;
        for(int i=0;i<n-1;i++)
        {
            dest=Math.max(dest,nums[i]+i);
              if(pos==i)
              {
                    pos=dest;
                    jump++;
              
                    if(pos<=i)
                    return -1;
             
                    if(pos>=n-1)
                     break;
              }
        }
        return jump;
    }
}