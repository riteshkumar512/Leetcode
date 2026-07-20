class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0 ,j=numbers.length-1;
        int[]ans=new int[2];
        while (j>i) {
            if (numbers[i]  + numbers[j] > target) {
                j--;
            }else if (numbers[i]  + numbers[j] < target) {
                i++;
            } else  if (numbers[i]+numbers[j]==target) {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
        }
        return ans;
    }
}