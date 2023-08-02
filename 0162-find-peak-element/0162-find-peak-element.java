class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n==1){return 0;}
        if(arr[0]>arr[1]){return 0;}
        int i = 1,r = n-2;
        while(i<=r){
            int mid = (i+r)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid-1]<arr[mid]){
                i = mid+1;
            }
            else{
                r = mid;
            }
        }
       if(arr[n-1]>arr[n-2]){return n-1;}
        return -1;
    }
}