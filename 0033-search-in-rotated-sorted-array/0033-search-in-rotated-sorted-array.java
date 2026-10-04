class Solution {
    public int search(int[] arr, int target) {
     int st=0;
     int end=arr.length-1;
     int ans=-1;

     while(st <= end){
        int mid=(st+ end )/2;

        if (arr[mid] == target){
            ans=mid;
            return ans;
        }
        else if(arr[st] <= arr[mid]){//left part is sorted
            if (arr[st] <= target && arr[mid] >= target){
                end=mid-1;
            }else{
                st=mid+1;
            }

        }
        else{//right part is sorted
            if (arr[mid] <= target  && arr[end] >= target){
                    st=mid+1;
            }else{
                end=mid-1;
            }
        }
     }   
     return ans;
    }
}