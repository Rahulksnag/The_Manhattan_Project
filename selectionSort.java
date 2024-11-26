class Solution {
    void selectionSort(int[] arr) {
        // code here
        // int n=arr.length;
        
        
        // int temp;
        // for(int j=0;j<n;j++){
        //     int max=Integer.MIN_VALUE;
        //     i5nt max_index=-1;
        //     for(int i=0;i<n-j;i++){
        //         if (arr[i]>max){
        //             max_index=i;
        //             max=arr[i];
        //         }
        //     }
        //     //swap
        //     temp=arr[max_index];
        //     arr[max_index]=arr[n-j-1];
        //     arr[n-j-1]=temp;
        // }
        int n=arr.length,temp,max;
        for(int i=0;i<n-1;i++){
            max=0;
            for(int j=0;j<=n-1-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            temp=arr[max];
            arr[max]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }
}
