class Solution {
    public int findMin(int[] arr) {
        int st=0;
        int end=arr.length-1;

        while(st < end){
            int mid=(st+end)/2;
            if(arr[mid] > arr[end]){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        return arr[st];
    }
}