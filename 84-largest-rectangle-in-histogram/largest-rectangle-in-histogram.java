class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights==null){
            return 0;
        }
        int n=heights.length;
        if(n==0)
        {
            return 0;
        }
        if(n==1) 
        {
            return heights[0];
        }
        int[]leftSmaller=new int[n];
        int []rightSmaller=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        rightSmaller[n-1]=n;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
               rightSmaller[i]=n;
            else
                 rightSmaller[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();

        st.push(0);
       leftSmaller[0]=-1;
         for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
               leftSmaller[i]=-1;
            else
                 leftSmaller[i]=st.peek();
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int width=rightSmaller[i]-leftSmaller[i]-1;
            int area=heights[i]*width;
            ans=Math.max(ans,area);
        }
        return ans;
    }
}