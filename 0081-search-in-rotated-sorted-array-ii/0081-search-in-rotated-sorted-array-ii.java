class Solution {
    public boolean search(int[] arr, int target) {
        int st=0;
        int end=arr.length-1;
        boolean ans= false;

        while(st <= end){
            int mid=(st+end)/2;
            if(arr[mid] == target){
                ans=true;
                return ans;
            }
             else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                    st++;
                    end--;
            }
            else if(arr[mid] >= arr[st]){//left part is sorted
                if(arr[st] <= target && target <=  arr[mid]){
                    end=mid-1;
                }else{
                st=mid+1;
                }
            }
        
            else{//right part is sorted
                if(arr[mid] <= target && target <= arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}