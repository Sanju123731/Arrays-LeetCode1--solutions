class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result=new ArrayList<>();
        while(i<n && j<m)
        {
            if(nums1[i]==nums2[j])
            {  
               nums1[k++]=nums1[i];
                i++;
                j++;
            
           }
            else if(nums1[i]<nums2[j])
               i++;
            else
            j++;
        }
        int []resArr=new int[k];
        for(int s=0;s<k;s++)
        {
            resArr[s]=nums1[s];
        }
        return resArr;
       
    }
}