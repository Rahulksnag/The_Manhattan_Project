class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int comp=0;
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<=arr.length -1;i++){
            comp=target-arr[i];
            if(set.contains(comp)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
