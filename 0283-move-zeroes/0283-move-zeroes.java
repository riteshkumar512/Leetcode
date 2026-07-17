class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while (i<nums.length){
            if (j < nums.length-1 && nums[i]==nums[j]){
                j++;
            }else if (nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }else {
                i++;
            }

        }
    }
}