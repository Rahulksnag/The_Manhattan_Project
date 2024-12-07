class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r){return;}
        
        int m=(l+r)/2;
        
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        
        merge(arr,l,m,r);
        
        return;
    }
    void merge(int[] arr,int l, int m, int r){
        int i=l;
        int j=m+1;
        int k=0;
        int[] mix=new int[r-l+1];
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                mix[k]=arr[i];
                i++;k++;
            }
            if(arr[j]<=arr[i]){
                mix[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=m){
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<=r){
            mix[k]=arr[j];
            j++;k++;
        }
        for(int o=0;o<mix.length;o++){
            arr[l+o]=mix[o];
        }
    }
}
