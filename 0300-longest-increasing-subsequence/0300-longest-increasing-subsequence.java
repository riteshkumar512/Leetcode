class Solution {
    public int lengthOfLIS(int[] nums) {
         int [] dp=new int[nums.length];
        dp[0]=nums[0];
        int len=1;
        for (int i = 0; i < dp.length; i++) {
            if (nums[i] > dp[len-1]){
                dp[len]=nums[i];
                len++;
            }else {
                int idx=BinarySearch(dp,0,len-1,nums[i]);
                dp[idx]=nums[i];
            }
        }
        return len;
    }
    private static int BinarySearch (int[] dp, int si,int ei,int item){
        int ans=0;
        while (si<=ei){
            int mid=(si+ei)/2;
            if (dp[mid]>=item){
                ans=mid;
                ei=mid-1;
            }else {
                si=mid+1;
            }
        }
        return  ans;
    }
}