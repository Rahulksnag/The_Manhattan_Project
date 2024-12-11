class Solution {
    public int mids(int mid,int[] arr){
        if(mid-1>-1){
        if(arr[mid]==arr[mid-1]){
            return mids(mid-1,arr);
        }
        }
        return mid;
    }
    public int bs(int l,int h,int[] arr,int k){
        int mid=(h+l)/2;
        if(arr[mid]==k){return mids(mid,arr);}
        if(h<l){return -1;}
        if(k<arr[mid]){
            return bs(l,mid-1,arr,k);
        }
        if(k>arr[mid]){
            return bs(mid+1,h,arr,k);
        }
        return -1;
        
    }
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l=0;
        int h=arr.length-1;
        int ind =bs(l,h,arr,k);
        return ind;
    }
}
