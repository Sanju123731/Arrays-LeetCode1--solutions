class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int miniDiff=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++)
        {
            miniDiff=Math.min(miniDiff,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==miniDiff)
            {
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return result;
    }
}