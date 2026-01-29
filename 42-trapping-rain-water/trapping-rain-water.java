class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int leftMax=0;
        int rightMax=0;
        int water=0;
        while(low<high)
        {
            if(arr[low]<arr[high])
            {
                if(arr[low]>=leftMax)
                {
                    leftMax=arr[low];
                }
                else
                {
                    water+=leftMax-arr[low];
                }
               low++;
            }
            else{
                if(arr[high]>=rightMax)
                {
                    rightMax=arr[high];
                }
                else{
                    water+=rightMax-arr[high];
                }
                high--;
            }
        }
        return water;

    }
}