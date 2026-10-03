class Solution {
    public int[] searchRange(int[] arr, int target) {
     int [] ans ={-1,-1};
     int st=0;
     int end=arr.length-1;

     while(st <= end){
        int mid=(st+end)/2;
        // first occurance
        if  (arr[mid]==target){
            ans[0]=mid;
            end=mid-1;
        }else if (arr[mid] < target){
            st=mid+1;
        }
        else{
            end=mid-1;
        }
     }

        //last occurance
        st=0;
        end=arr.length-1;
        while(st <= end){
         int mid=(st+end)/2;
        if  (arr[mid]==target){
            ans[1]=mid;
            st=mid+1;
        }else if (arr[mid] > target){
            end=mid-1;
        }
        else{
            st=mid+1;
        }        
     }
     return ans;

    }
}