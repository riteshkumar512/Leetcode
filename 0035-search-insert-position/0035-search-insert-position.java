class Solution {
    public int searchInsert(int[] arr, int target) {
        int st=0;
        int end=arr.length-1;
        int ans=-1;

        while(st <= end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                ans=mid;
                return ans;
            }else if(arr[mid] < target){
                st= mid+1;
            }else{
                end= mid-1;
            }
        }
        return st;
    }
}