class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n=nums2.length;
       int []res=new int[n];
        Stack<Integer> st=new Stack<>();
        // next greater element for nums 2
        for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && nums2[i]>=st.peek()) {
            st.pop();}
          if(st.isEmpty()){
            res[i]=-1; }
          else{
                 res[i]=st.peek(); }
         st.push(nums2[i]);
    }
    // build result for nums1
    int []result =new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        int value=nums1[i];
        // find index of value in nums2
        for(int j=0;j<nums2.length;j++) {
            if(nums2[j]==value){
                result[i]=res[j];
                break;
            } } }
    return result;
    }}